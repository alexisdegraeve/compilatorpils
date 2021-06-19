package be.unamur.info.b314.compiler;

import be.unamur.info.b314.compiler.main.Main;
import be.unamur.info.b314.compiler.main.MyConsoleErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;

/**
 * Check Map file from the world file and
 * Print to  file NBC Code for a given tree using provided symbol table.
 *
 * @author Alexis Degraeve, François William, Thomas Wery
 */

public class NBCVisitor extends PlayPlusBaseVisitor<Object> {

    private final Map<String, VariableModel> symTable;
    private Map<String, VariableModel> symTableWorld = null;
    private final NBCPrinter printer;
    private boolean insideAffectInstr = false;
    private String  variableNameVisited = "";
    private int countPlayer = 0;
    private int countEnnemi = 0;
    private int countGraal = 0;
    private int countZombie = 0;
    private int countMap = 0;
    private int countRadio = 0;
    private int countRadar = 0;
    private boolean worldFileLoaded = false;
    private boolean arenafound = false;
    private File inputFile = null;
    private String extInputFile = "";
    private boolean isWhile = false;
    private boolean isEnterFunction = false;
    private int countLoop = 0;
    private int saveInd1 = 0;
    private int saveInd2 = 0;

    public NBCVisitor(Map<String, VariableModel> symTable, NBCPrinter printer, File inputFile) {
        this.symTable = symTable;
        this.printer = printer;
        this.inputFile = inputFile;
        this.extInputFile = getFileExtension(inputFile);
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

    @Override
    public Object visitImportInstr(PlayPlusParser.ImportInstrContext ctx) {
      //  try {
            // Récupère le nom du fichier et ajoute l'extension wld  sur le serveur
            String inputPath = inputFile.getParent();
            String targetFileWld =  inputPath + ("//").concat(ctx.filedecl().filename().getText()).concat(".wld");
            boolean existsWld = false;
            if(targetFileWld != null) {
                worldFileLoaded = true;
                File resourceFile = new File(targetFileWld);
                System.out.println("Printing WLD File");
                existsWld = resourceFile.exists();
                if(existsWld) {
                    Main.readFile(resourceFile);
                }
            }
            if(existsWld) {
                try {

                    PlayPlusParser.RootContext treeWorld = parse(new ANTLRInputStream(new FileInputStream(targetFileWld)));
                    this.symTableWorld = fillSymTable(treeWorld);
                    System.out.println(symTableWorld);
                }
                catch (Exception e) {
                    throw new RuntimeException(e);
                }
                CheckingWorldTableFromWorldFile();
            }


        return visitChildren(ctx);
    }

    private void CheckingWorldTableFromWorldFile() {
        if( this.symTableWorld.get("arena") != null) {
            arenafound = true;
            Object tmp = this.symTableWorld.get("arena").getValeur();
            if (tmp.getClass().getComponentType().equals(int[].class)) {
                int[][] tmp2 = (int[][]) tmp;
                for (int i = 0; i < tmp2.length; i++) {
                    for (int j = 0; j < tmp2[i].length; j++) {
                        checkingValueArena(tmp2[i][j]);
                    }
                }
            }
            checkingMapArena();
        }
    }

    private PlayPlusParser.RootContext parse(ANTLRInputStream input) throws ParseCancellationException {
        CommonTokenStream tokens = new CommonTokenStream(new PlayPlusLexer(input));
        PlayPlusParser parser = new PlayPlusParser(tokens);
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        PlayPlusParser.RootContext tree;
        try {
            tree = parser.root();
        } catch (RecognitionException e) {
            throw new IllegalArgumentException("Error while retrieving parsing tree!", e);
        }
        if (errorListener.errorHasBeenReported()) {
            throw new IllegalArgumentException("Error while parsing input!");
        }
        return tree;
    }

    private Map<String, VariableModel> fillSymTable(PlayPlusParser.RootContext tree) {
        SymTableFiller filler = new SymTableFiller();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(filler, tree);
        return filler.getSymTable();
    }

    @Override
    public Object visitRoot(PlayPlusParser.RootContext ctx) {
        // On écrit normalement dans tout les cas s'il y a une exception elle sera levé
        countPlayer = 0;
        countEnnemi = 0;
        countGraal = 0;
        countZombie = 0;
        countMap = 0;
        countRadio = 0;
        countRadar = 0;
        printer.printFirstLine();
        printer.printInitializeConfig();
        printer.printEmpty();
        printer.printDsegSegment();
        super.visitRoot(ctx); // Print instructions
        if(extInputFile.equalsIgnoreCase("wld")) {
            checkingMapArena();
        }
        printer.printStop(); // Stop execution
        return null;
    }

    @Override
    public Object visitIdentification(PlayPlusParser.IdentificationContext ctx) {
        printer.printDeclareVariable(ctx.ID().getText().toLowerCase(), ctx.type());
        return null;
    }


    //Si on est dans une déclaration d'array avec des crochets on bypasse car on a déjà la valeur
    @Override
    public Object visitArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitInsideClauseDefault(PlayPlusParser.InsideClauseDefaultContext ctx) {
        printer.printEndDsegSegment();
        printer.printThreadMain();
        return visitChildren(ctx);
    }

    @Override
    public Object visitInsideEndProg(PlayPlusParser.InsideEndProgContext ctx) {
        printer.printEmpty();
        printer.printEndThreadMain();
        return visitChildren(ctx);
    }

    @Override
    public Object visitFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx) {
        isEnterFunction = true;
        return visitChildren(ctx);
    }

    @Override public Object visitFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx) {
        isEnterFunction = false;
        return visitChildren(ctx);
    }

    @Override
    public Object visitNextInstr(PlayPlusParser.NextInstrContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitActionShoot(PlayPlusParser.ActionShootContext ctx) {
        if(ctx.WEST() != null){
            printer.printShootWest();
        }
        if(ctx.EAST() != null){
            printer.printShootEast();
        }
        if(ctx.NORTH() != null){
            printer.printShootNorth();
        }
        if(ctx.SOUTH() != null){
            printer.printShootSouth();
        }
        return null;
    }

    @Override
    public Object visitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        insideAffectInstr =  true;
        return visitChildren(ctx);
    }


    @Override
    public Object visitExprGID(PlayPlusParser.ExprGIDContext ctx) {
        if (insideAffectInstr)  {
            variableNameVisited = ctx.ID().getText();
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprGArray(PlayPlusParser.ExprGArrayContext ctx) {
        if (insideAffectInstr)  {
            variableNameVisited = ctx.ID().getText();
            try{
                int ind1 = -1;
                int ind2 = -1;
                if(ctx.exprD(0) !=null) {
                    ind1 = Integer.parseInt(ctx.exprD(0).getText());
                    saveInd1 = ind1;
                }
                if(ctx.exprD(1) !=null) {
                    ind2 = Integer.parseInt(ctx.exprD(1).getText());
                    saveInd2 = ind2;
                }

            }
            catch(Exception e) {
            }
        }
        return null;
    }


    @Override
    public Object visitExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx) {
        //  assignValue(ctx.getText());
        //if(ctx.getParent().getClass(PlayPlusParser.AffectInstrContext))
        if (insideAffectInstr) {
            try {
                String id = ctx.ID().getText();
                if (this.symTable.get(id) != null) {
                    double tmpvalue = (double) this.symTable.get(id).getValueReturn();
                    int value = (int) tmpvalue;
                    printer.printAssignVariable(variableNameVisited, String.valueOf(value));
                }
            } catch (Exception e) {
            }
            insideAffectInstr = false;
        }
        return visitChildren(ctx);


    }




    @Override
    public Object visitExprDEntiere(PlayPlusParser.ExprDEntiereContext ctx) {
      //  assignValue(ctx.getText());
        //if(ctx.getParent().getClass(PlayPlusParser.AffectInstrContext))
        try {
            PlayPlusParser.AffectInstrContext instr = (PlayPlusParser.AffectInstrContext) ctx.getParent();
            Integer.parseInt(instr.exprD().getText());
            assignValue(ctx.getText());
        } catch (Exception e) {
        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitExprCaseMap(PlayPlusParser.ExprCaseMapContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.MAP));
        return visitChildren(ctx);
    }


    @Override
    public Object visitExprCaseEnnemi(PlayPlusParser.ExprCaseEnnemiContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.ENNEMI));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseZombie(PlayPlusParser.ExprCaseZombieContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.ZOMBIE));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseGraal(PlayPlusParser.ExprCaseGraalContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.GRAAL));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCasePlayer(PlayPlusParser.ExprCasePlayerContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.PLAYER));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseRadio(PlayPlusParser.ExprCaseRadioContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.RADIO));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseRadar(PlayPlusParser.ExprCaseRadarContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.RADAR));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseRock(PlayPlusParser.ExprCaseRockContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.ROCK));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprCaseFruits(PlayPlusParser.ExprCaseFruitsContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.FRUIT));
        return visitChildren(ctx);
    }


    @Override
    public Object visitExprCaseSoda(PlayPlusParser.ExprCaseSodaContext ctx) {
        assignValue(String.valueOf(VariableEnvironement.SODA));
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprDTrue(PlayPlusParser.ExprDTrueContext ctx) {

        /* if (isWhile) {
            printer.printWhile(ctx.getParent().getText());
        } */
        assignValue(ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprDFalse(PlayPlusParser.ExprDFalseContext ctx) {
        isWhile = false;
        assignValue(ctx.getText());
        return visitChildren(ctx);
    }

    public void assignValue(String value) {
        if (insideAffectInstr)  {
            if( this.symTable.get(variableNameVisited) != null) {
                if(!isEnterFunction) {
                    if(( this.symTable.get(variableNameVisited).getType() == VariableType.SQUARE)
                      || ( this.symTable.get(variableNameVisited).getType() == VariableType.ARRAY)) {
                        int output = 0;
                        if(value.equalsIgnoreCase("true")) {
                            output = 1;
                        } else {
                            if(value.equalsIgnoreCase("false")) {
                                output = 0;
                            } else {
                                output = Integer.parseInt(value);
                            }
                        }
                        printer.printAssignVariableArray(variableNameVisited, saveInd1, saveInd2, output);
                    }else {
                        if(this.symTable.get(variableNameVisited).getType() == VariableType.VECTOR) {

                            int output = 0;
                            if(value.equalsIgnoreCase("true")) {
                                output = 1;
                            } else {
                                if(value.equalsIgnoreCase("false")) {
                                    output = 0;
                                } else {
                                    output = Integer.parseInt(value);
                                }
                            }
                            printer.printAssignVariableVector(variableNameVisited, saveInd1, output);
                        }else {
                            printer.printAssignVariable(variableNameVisited,  value );
                        }
                    }


                }

                if(variableNameVisited.equalsIgnoreCase("arena")) {
                    arenafound = true;
                    int valuetocheck = Integer.parseInt(value);
                    checkingValueArena(valuetocheck);
                }
            }

            insideAffectInstr = false;
        }
    }

    public void checkingValueArena(int value) {
        if(value == VariableEnvironement.PLAYER) {
            countPlayer++;
        }
        if(value == VariableEnvironement.ENNEMI) {
            countEnnemi++;
        }
        if(value == VariableEnvironement.GRAAL) {
            countGraal++;
        }
        if(value == VariableEnvironement.ZOMBIE) {
            countZombie++;
        }
        if(value == VariableEnvironement.MAP) {
            countMap++;
        }
        if(value == VariableEnvironement.RADIO) {
            countRadio++;
        }
        if(value == VariableEnvironement.RADAR) {
            countRadar++;
        }
    }

    public void checkingMapArena(){
        if(countPlayer==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_PLAYER);
        }
        if(countPlayer>1) {
            throw new RuntimeException(SymTableException.ERROR_ONLY_ONE_PLAYER);
        }
        if(countEnnemi==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_ENNEMI);
        }
        if(countEnnemi>1) {
            throw new RuntimeException(SymTableException.ERROR_ONLY_ONE_ENNEMI);
        }
        if(countGraal>1) {
            throw new RuntimeException(SymTableException.ERROR_ONLY_ONE_GRAAL);
        }
        if(countGraal==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_GRAAL);
        }
        if(countMap==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_MAP);
        }
//       if(countRadio==0) {
//          throw new RuntimeException(SymTableException.ERROR_NO_RADIO);
//       }
        if(countRadar==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_RADAR);
        }
        if(countZombie==0) {
            throw new RuntimeException(SymTableException.ERROR_NO_ZOMBIE);
        }
    }


    @Override
    public Object visitWhileInstr(PlayPlusParser.WhileInstrContext ctx) {
        isWhile = true;
        countLoop++;
        printer.printEmpty();
        try {
            PlayPlusParser.ExprDInfContext exprd = (PlayPlusParser.ExprDInfContext) ctx.exprD();
            Integer whilecount =  Integer.parseInt(exprd.exprD(1).getText());
            printer.printWhile(countLoop, whilecount);
            //printer.printAssignVariableAdd(nLeft, nRight, var);
        }catch(Exception e) {
            isWhile = false;
        }


        return visitChildren(ctx);
    }

    @Override
    public Object visitInsideDoneWhile(PlayPlusParser.InsideDoneWhileContext ctx) {
        if(isWhile) {
            printer.printDoneWhile(countLoop);
            isWhile = false;
        }

        return visitChildren(ctx);
    }

    private String EvaluateConstant(String nLeft) {
        String nLeftValue = nLeft;
        if(nLeft.indexOf("count")>-1) {
            if(nLeft.indexOf("soda")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.SODA);
            }
            if(nLeft.indexOf("fruits")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.FRUIT);
            }
            if(nLeft.indexOf("ammo")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.AMMO);
            }
            if(nLeft.indexOf("radar")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.RADAR);
            }
            if(nLeft.indexOf("radio")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.RADIO);
            }
            if(nLeft.indexOf("map")>-1) {
                nLeftValue = String.valueOf(VariableEnvironement.MAP);
            }
        }
        if(nLeft.indexOf("latitude")>-1) {
            nLeftValue = String.valueOf(VariableEnvironement.LATITUDE);
        }
        if(nLeft.indexOf("longitude")>-1) {
            nLeftValue = String.valueOf(VariableEnvironement.LONGITUDE);
        }

        return nLeftValue;
    }

    @Override
    public Object visitExprDPlus(PlayPlusParser.ExprDPlusContext ctx) {
        if(!isEnterFunction) {
            String nLeft = ctx.exprD().get(0).getText();
            String nRight = ctx.exprD().get(1).getText();
            try {
                PlayPlusParser.AffectInstrContext instr = (PlayPlusParser.AffectInstrContext) ctx.getParent();
                String nLeftValue = this.EvaluateConstant(nLeft);
                String nRightValue = this.EvaluateConstant(nRight);
                String var = instr.exprG().getChild(0).getText();

                printer.printAssignVariableAdd(nLeftValue, nRightValue, var);


            } catch (Exception e) {
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprDMinus(PlayPlusParser.ExprDMinusContext ctx) {
        if(!isEnterFunction) {
            String nLeft = ctx.exprD().get(0).getText();
            String nRight = ctx.exprD().get(1).getText();
            try {
                PlayPlusParser.AffectInstrContext instr = (PlayPlusParser.AffectInstrContext) ctx.getParent();
                String nLeftValue = this.EvaluateConstant(nLeft);
                String var = instr.exprG().getChild(0).getText();

                printer.printAssignVariableSub(nLeftValue, nRight, var);
            } catch (Exception e) {
            }
        }
        return visitChildren(ctx);
    }


    @Override
    public Object visitExprDTimes(PlayPlusParser.ExprDTimesContext ctx) {
        if(!isEnterFunction) {
            String nLeft = ctx.exprD().get(0).getText();
            String nRight = ctx.exprD().get(1).getText();
            try {
                PlayPlusParser.AffectInstrContext instr = (PlayPlusParser.AffectInstrContext) ctx.getParent();
                String nLeftValue = this.EvaluateConstant(nLeft);
                String var = instr.exprG().getChild(0).getText();
                printer.printAssignVariableTimes(nLeftValue, nRight, var);
            } catch (Exception e) {
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitExprDDivide(PlayPlusParser.ExprDDivideContext ctx) {
        if(!isEnterFunction) {
            String nLeft = ctx.exprD().get(0).getText();
            String nRight = ctx.exprD().get(1).getText();
            try {
                PlayPlusParser.AffectInstrContext instr = (PlayPlusParser.AffectInstrContext) ctx.getParent();
                String nLeftValue = this.EvaluateConstant(nLeft);
                String var = instr.exprG().getChild(0).getText();
                printer.printAssignVariableDivide(nLeftValue, nRight, var);
            } catch (Exception e) {
            }
        }
        return visitChildren(ctx);
    }



}
