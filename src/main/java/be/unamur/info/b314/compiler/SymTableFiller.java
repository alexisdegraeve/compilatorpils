package be.unamur.info.b314.compiler;

import com.google.common.collect.Maps;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * Fills a symbol table using ANTLR listener .
 *
 * @author Alexis Degraeve, François William, Thomas Wery
 */



public class SymTableFiller extends PlayPlusBaseListener {

    final static String EMPTY_STRING = "";

    private final Map<String, VariableModel> symTable;
    String keySource = EMPTY_STRING;
    String keySourceComplete = EMPTY_STRING;
    private Map<String, VariableModel> localSymTable = null;

    /* Nous utilisons un vecteur d'indice pour les arrays pour le côté assignation (stackDeclareIndiceArray)
    *                 un vecteur d'indice pour les arrays pour le côté déclaration (stackAssignIndiceArray)
    *                 un vecteur d'indice pour les arrays pour les arrays neaar by
    * Ainsi de deux poiles  une pour les valeurs entières (stackValeurDouble)
    *                        une autre pour les valeurs booléennes (stackBoolean)
    */
    private LinkedList<Integer> stackDeclareIndiceArray = new LinkedList<Integer>();
    private LinkedList<Integer> stackAssignIndiceArray = new LinkedList<Integer>();
    private Stack<Integer> stackIndiceNearbyInteger = new Stack<>();
    private Stack<Double> stackValeurDouble = new Stack<>();
    private Stack<Boolean> stackBoolean = new Stack<>();

    private Object declareArray = null;
    private int countImport = 0;
    private boolean isArray = false;
    private boolean enterIDFunction;
    private boolean enterNearBy = false;
    private boolean isEnterArray = false;
    private boolean isLeftEnterArray = false;
    private boolean conditionIf = false;
    private boolean conditionwhen = false;
    private String enterfunctionname = EMPTY_STRING;
    private boolean isEnterFctReturn = false;
    private String typeReturnFctTempory = EMPTY_STRING;


    public SymTableFiller() {
        this.symTable = Maps.newHashMap();
    }

    @Override
    public void exitIdentification(PlayPlusParser.IdentificationContext ctx) {
        String nomvariable = ctx.ID().getText();
        String typevariable = ctx.type().getText();

        if (ctx.type().array() != null) {
            if (isArray) {
                typevariable = VariableType.ARRAY;
            } else {
                typevariable = VariableType.VECTOR;
            }
        }

        VariableModel variableObject = new VariableModel(typevariable, nomvariable);
        if (((typevariable.equalsIgnoreCase(VariableType.ARRAY)) ||
                (typevariable.equalsIgnoreCase(VariableType.VECTOR))) && (declareArray != null)) {
            variableObject.setValeur(declareArray);
        }

        /* Si un square est déclaré sans crochets alors, quand on sort du "AS" on le considère comme un integer
         * Pour rappel:
         *      declare i as scalar => integer
         *      declare i as scalar[] => vecteur
         *      declare i as scalar[,] => array
         */
        if ((ctx.type().SCALAR() != null) && (ctx.type().getText().equalsIgnoreCase(VariableType.SQUARE))) {
            Integer tmp = 0;
            variableObject.setValeur(tmp);
        }

        if (typevariable.equalsIgnoreCase(VariableType.INTEGER)) {
            Integer tmp = 0;
            variableObject.setValeur(tmp);
        }

        if (typevariable.equalsIgnoreCase(VariableType.BOOLEAN)) {
            Boolean tmp = false;
            variableObject.setValeur(tmp);
        }

        if (enterIDFunction && localSymTable != null) {
            /* on est dans une fonction */
            VariableModel objLocal = null;
            if (localSymTable != null && localSymTable.containsKey(nomvariable)) {
                objLocal = localSymTable.get(nomvariable);
            }

            if (objLocal == null) {
                /* Cas ou on est dans une fonction (CAS Spécial) */
                /* On rattache la variableObject à la table locale des symboles */
                localSymTable.put(nomvariable, variableObject);
            } else {
                //Déjà déclaré exception
            }
        } else {
            /* Cas ou on est pas une fonction (CAS Normal) */
            /* On rattache la variableObject à la table générale des symboles */
            symTable.put(nomvariable, variableObject);
        }
    }

    @Override
    public void enterExprDFalse(PlayPlusParser.ExprDFalseContext ctx) {
        this.stackBoolean.push(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public void exitExprDVarDeclCro(PlayPlusParser.ExprDVarDeclCroContext ctx) {

        /* Par défaut les indice sont à -1 pour dire qu'on est pas dans un array */
        int indice1 = -1;
        int indice2 = -1;

        /* On va chercher les valeurs dans la bonne pile pour les mettre en indice
        *  On peut avoir un cas ou array[2 + 3, 8]
        *  On peut avoir un cas aussi ou  array[ array2[2 + 3], 8] et c'est pour cela qu'il faut aller dans
        *  la stack valeurdouble pour chercher la valeur de l'array imbriqué
         */
        if (!isLeftEnterArray) {
            if (ctx.exprD().size() == 1 && !stackValeurDouble.isEmpty()) {
                indice1 = stackValeurDouble.pop().intValue();
            }
            if (ctx.exprD().size() == 2 && !stackValeurDouble.isEmpty()) {
                indice1 = stackValeurDouble.pop().intValue();
                indice2 = indice1;
                indice1 = stackValeurDouble.pop().intValue();
            }
        } else {
            if (ctx.exprD().size() == 1 && !stackAssignIndiceArray.isEmpty()) {
                indice1 = stackAssignIndiceArray.remove().intValue();
            }
            if (ctx.exprD().size() == 2 && !stackAssignIndiceArray.isEmpty()) {
                indice1 = stackAssignIndiceArray.remove().intValue();
                indice2 = stackAssignIndiceArray.remove().intValue();
            }
        }
        getValueFromSymbolTable(ctx.ID().getText(), indice1, indice2);

    }


    // Ajouter une variable a la pile
    @Override
    public void exitExprDVarDecl(PlayPlusParser.ExprDVarDeclContext ctx) {
        int indice1 = -1;
        int indice2 = -1;
        getValueFromSymbolTable(ctx.getText(), indice1, indice2);
    }


    /* On va chercher la valeur dans la table des symboles
     *  on commence par chercher dans la table locale
     *  si c'est pas trouvé on la chercher dans la table générale
     */
    void getValueFromSymbolTable(String variableName, int indice1, int indice2) {

        VariableModel objLocal = null;
        if (enterIDFunction && (localSymTable != null) && (localSymTable.containsKey(variableName))) {
            objLocal = localSymTable.get(variableName);
        }
        if ((objLocal == null) && (symTable != null) && (symTable.containsKey(variableName)))
            objLocal = symTable.get(variableName);
        if (objLocal != null) {

            if(isEnterFctReturn) typeReturnFctTempory = objLocal.getType();

            /* On va chercher la valeur dans un vecteur
             *  Exemple:  v4[1] (vecteur)
             *  mp.getClass().getComponentType().equals(int.class) -> vecteur
             */
            if ((indice2 == -1) && (indice1 > -1)) {
                if ((objLocal.getType().equalsIgnoreCase(VariableType.SQUARE)) ||
                        (objLocal.getType().equalsIgnoreCase(VariableType.VECTOR))) {
                    Object tmp = objLocal.getValeur();
                    if (tmp.getClass().getComponentType().equals(int.class)) {
                        int[] tmp2 = (int[]) tmp;
                        int tmpint = (int) tmp2[indice1];
                        if (!isLeftEnterArray) {
                            if(isEnterFctReturn) typeReturnFctTempory  = VariableType.INTEGER;
                            this.stackValeurDouble.push(((Integer) tmpint).doubleValue());
                        } else {
                            this.stackAssignIndiceArray.add(tmpint);
                        }
                    }
                    if (tmp.getClass().getComponentType().equals(boolean.class)) {
                        if(isEnterFctReturn) typeReturnFctTempory = VariableType.BOOLEAN;
                        boolean[] tmp2 = (boolean[]) tmp;
                        boolean tmpBoolean = (boolean) tmp2[indice1];
                        this.stackBoolean.push(((Boolean) tmpBoolean).booleanValue());
                    }
                }
            }

            /* On va chercher la valeur dans un array
             *  Exemple:  v4[1, 2] (vecteur)
             *  mp.getClass().getComponentType().equals(int[].class) -> array
             *  Attention la différence avec les crochets qui permettent de voir si c'est un array
             */
            if ((indice1 > -1) && (indice2 > -1)) {
                if ((objLocal.getType().equalsIgnoreCase(VariableType.SQUARE)) ||
                        (objLocal.getType().equalsIgnoreCase(VariableType.ARRAY))) {
                    Object tmp = objLocal.getValeur();
                    if (tmp.getClass().getComponentType().equals(int[].class)) {
                        int[][] tmp2 = (int[][]) tmp;
                        int tmpint = (int) tmp2[indice1][indice2];
                        if (!isLeftEnterArray) {
                            if(isEnterFctReturn) typeReturnFctTempory = VariableType.INTEGER;
                            this.stackValeurDouble.push(((Integer) tmpint).doubleValue());
                        } else {
                            this.stackAssignIndiceArray.add(tmpint);
                        }
                    }
                    if (tmp.getClass().getComponentType().equals(boolean[].class)) {
                        if(isEnterFctReturn) typeReturnFctTempory = VariableType.BOOLEAN;
                        boolean[][] tmp2 = (boolean[][]) tmp;
                        boolean tmpBoolean = (boolean) tmp2[indice1][indice2];
                        this.stackBoolean.push(((Boolean) tmpBoolean).booleanValue());
                    }
                }
            }

            /* On va chercher la valeur de retour de la fonction
             */
            if (objLocal.getKind() == Kind.FUNCTION) {

                Object tmp = objLocal.getValueReturn();

                if (tmp instanceof Boolean) {
                    this.stackBoolean.push(((Boolean) tmp).booleanValue());
                }
                if (tmp instanceof Double) {
                    this.stackValeurDouble.push((Double) tmp);
                }

                if (tmp != null && tmp.getClass().getComponentType() != null) {
                    if (tmp.getClass().getComponentType().equals(int[].class)) {
                        int[][] tmp2 = (int[][]) tmp;
                        int tmpint = (int) tmp2[indice1][indice2];
                        this.stackValeurDouble.push(((Integer) tmpint).doubleValue());
                    }
                    if (tmp.getClass().getComponentType().equals(boolean[].class)) {
                        boolean[][] tmp2 = (boolean[][]) tmp;
                        boolean tmpBoolean = (boolean) tmp2[indice1][indice2];
                        this.stackBoolean.push(((Boolean) tmpBoolean).booleanValue());
                    }
                }

                return;
            }
            //End Search Function


            /* On va chercher la valeur dans un  integer / boolean / square sans crochets (int) */
            boolean square = objLocal.getType().equalsIgnoreCase(VariableType.SQUARE) && indice1==-1 && indice2==-1;

            if (objLocal.getType().equalsIgnoreCase(VariableType.INTEGER) ||
                    square) {

                if (enterNearBy) {
                    // Nearby ajoutte indice
                    if ((Integer) objLocal.getValeur() == null) {
                        this.stackIndiceNearbyInteger.push(0);
                    } else {
                        this.stackIndiceNearbyInteger.push((Integer) (objLocal.getValeur()));
                    }
                } else {
                    if (isEnterArray) {
                        if ((Integer) objLocal.getValeur() == null) {
                            this.stackDeclareIndiceArray.add(0);
                        } else {
                            this.stackDeclareIndiceArray.add((Integer) (objLocal.getValeur()));
                        }
                    } else {
                        if (isLeftEnterArray) {
                            if ((Integer) objLocal.getValeur() == null) {
                                this.stackAssignIndiceArray.add(0);
                            } else {
                                this.stackAssignIndiceArray.add((Integer) (objLocal.getValeur()));
                            }
                        } else {
                            // Cas normale récupérer la valeur
                            /* if (objLocal == null) {
                                this.stackValeurDouble.push(0d);
                            } else {
                                this.stackValeurDouble.push(((Integer) objLocal.getValeur()).doubleValue());
                            } */
                            this.stackValeurDouble.push(((Integer) objLocal.getValeur()).doubleValue());
                        }



                    }

                }

            }

            if (objLocal.getType().equalsIgnoreCase(VariableType.BOOLEAN)) {
                if ((Boolean) objLocal.getValeur() == null) {
                    this.stackBoolean.push(false);
                } else {
                    this.stackBoolean.push((Boolean) (objLocal.getValeur()));
                }
            }


        } else {
            // S'il s'appelle lui-même c'est ok
            boolean callSelfFunction = variableName.equalsIgnoreCase(enterfunctionname);
            if(!callSelfFunction) {
                throw new RuntimeException(SymTableException.ERROR_VARIABLE_NOT_FOUND);
            }

        }
    }

    @Override
    public void enterArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx) {
        isEnterArray = true;
        if (ctx.NUMBER(0) != null) {
            this.stackDeclareIndiceArray.add(Integer.parseInt(ctx.NUMBER(0).getText()));
            isArray = false;
        }
        if (ctx.NUMBER(1) != null) {
            this.stackDeclareIndiceArray.add(Integer.parseInt(ctx.NUMBER(1).getText()));
            isArray = true;
        }

    }

    void assignStaticValueToStack(Integer input) {
        if (enterNearBy) {
            this.stackIndiceNearbyInteger.push(input);
        } else {
            if (isLeftEnterArray) {
                this.stackAssignIndiceArray.add(input);
            } else {
                if (!isEnterArray) {
                    // On met un valeur sur la stack c'est le cas normal
                    // On met ca en double pour garder la précision
                    this.stackValeurDouble.push(Double.valueOf(input));
                } else {
                    this.stackDeclareIndiceArray.add(input);
                    isEnterArray = false;
                }
            }
        }
    }


    @Override
    public void exitExprEntNumber(PlayPlusParser.ExprEntNumberContext ctx) {
        assignStaticValueToStack(Integer.valueOf(ctx.NUMBER().getText()));
    }

    @Override
    public void exitExprEntLatitude(PlayPlusParser.ExprEntLatitudeContext ctx) {
        assignStaticValueToStack(VariableEnvironement.LATITUDE);
    }

    @Override
    public void exitExprEntLongitude(PlayPlusParser.ExprEntLongitudeContext ctx) {
        assignStaticValueToStack(VariableEnvironement.LONGITUDE);
    }

    @Override
    public void exitExprEntGridSize(PlayPlusParser.ExprEntGridSizeContext ctx) {
        assignStaticValueToStack(VariableEnvironement.GRID_SIZE);
    }

    @Override
    public void exitExprEntCount(PlayPlusParser.ExprEntCountContext ctx) {
        if (ctx.MAP() != null) {
            assignStaticValueToStack(VariableEnvironement.MAP);
        }
        if (ctx.RADIO() != null) {
            assignStaticValueToStack(VariableEnvironement.RADIO);
        }
        if (ctx.RADAR() != null) {
            assignStaticValueToStack(VariableEnvironement.RADAR);
        }
        if (ctx.AMMO() != null) {
            assignStaticValueToStack(VariableEnvironement.AMMO);
        }
        if (ctx.FRUITS() != null) {
            assignStaticValueToStack(VariableEnvironement.FRUIT);
        }
        if (ctx.SODA() != null) {
            assignStaticValueToStack(VariableEnvironement.SODA);
        }
    }

    @Override
    public void exitActionDoNothing(PlayPlusParser.ActionDoNothingContext ctx) {
        if (ctx.DO() != null && ctx.NOTHING() != null) {
            VariableEnvironement.NEXT_ACTION = 0;
        }
    }

    @Override
    public void exitActionMove(PlayPlusParser.ActionMoveContext ctx) {
        if (ctx.MOVE() != null && ctx.NORTH() != null) {
            VariableEnvironement.NEXT_ACTION = 1;
        }
        if (ctx.MOVE() != null && ctx.EAST() != null) {
            VariableEnvironement.NEXT_ACTION = 2;
        }
        if (ctx.MOVE() != null && ctx.SOUTH() != null) {
            VariableEnvironement.NEXT_ACTION = 3;
        }
        if (ctx.MOVE() != null && ctx.WEST() != null) {
            VariableEnvironement.NEXT_ACTION = 4;
        }
    }


    @Override
    public void exitActionShoot(PlayPlusParser.ActionShootContext ctx) {
        if (ctx.SHOOT() != null && ctx.NORTH() != null) {
            VariableEnvironement.NEXT_ACTION = 5;
        }
        if (ctx.SHOOT() != null && ctx.EAST() != null) {
            VariableEnvironement.NEXT_ACTION = 6;
        }
        if (ctx.SHOOT() != null && ctx.SOUTH() != null) {
            VariableEnvironement.NEXT_ACTION = 7;
        }
        if (ctx.SHOOT() != null && ctx.WEST() != null) {
            VariableEnvironement.NEXT_ACTION = 8;
        }
    }

    @Override
    public void exitActionUse(PlayPlusParser.ActionUseContext ctx) {
        if (ctx.USE() != null && ctx.MAP() != null) {
            VariableEnvironement.NEXT_ACTION = 9;
        }
        if (ctx.USE() != null && ctx.RADIO() != null) {
            VariableEnvironement.NEXT_ACTION = 10;
        }
        if (ctx.USE() != null && ctx.RADAR() != null) {
            VariableEnvironement.NEXT_ACTION = 12;
        }
        if (ctx.USE() != null && ctx.FRUITS() != null) {
            VariableEnvironement.NEXT_ACTION = 11;
        }
        if (ctx.USE() != null && ctx.SODA() != null) {
            VariableEnvironement.NEXT_ACTION = 12;
        }
    }


    @Override
    public void exitExprDEnnemIs(PlayPlusParser.ExprDEnnemIsContext ctx) {
        if (ctx.EAST() != null) {
            this.stackBoolean.push(VariableEnvironement.ENNEMI_IS_EST);
        }
        if (ctx.WEST() != null) {
            this.stackBoolean.push(VariableEnvironement.ENNEMI_IS_WEST);
        }
        if (ctx.NORTH() != null) {
            this.stackBoolean.push(VariableEnvironement.ENNEMI_IS_NORTH);
        }
        if (ctx.SOUTH() != null) {
            this.stackBoolean.push(VariableEnvironement.ENNEMI_IS_SOUTH);
        }
    }

    @Override
    public void exitExprDGraalIs(PlayPlusParser.ExprDGraalIsContext ctx) {
        if (ctx.EAST() != null) {
            this.stackBoolean.push(VariableEnvironement.GRAAL_IS_EST);
        }
        if (ctx.WEST() != null) {
            this.stackBoolean.push(VariableEnvironement.GRAAL_IS_WEST);
        }
        if (ctx.NORTH() != null) {
            this.stackBoolean.push(VariableEnvironement.GRAAL_IS_NORTH);
        }
        if (ctx.SOUTH() != null) {
            this.stackBoolean.push(VariableEnvironement.GRAAL_IS_SOUTH);
        }
    }


    @Override
    public void exitExprEntLife(PlayPlusParser.ExprEntLifeContext ctx) {
        assignStaticValueToStack(VariableEnvironement.LIFE);
    }

    // Ajouter un boolean a la pile des boolean
    @Override
    public void enterExprDTrue(PlayPlusParser.ExprDTrueContext ctx) {
        this.stackBoolean.push(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public void exitExprCaseDirt(PlayPlusParser.ExprCaseDirtContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.DIRT));
    }

    @Override
    public void exitExprCaseRock(PlayPlusParser.ExprCaseRockContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.ROCK));
    }

    @Override
    public void exitExprCaseVines(PlayPlusParser.ExprCaseVinesContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.VINE));
    }

    @Override
    public void exitExprCaseZombie(PlayPlusParser.ExprCaseZombieContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.ZOMBIE));
    }

    @Override
    public void exitExprCaseEnnemi(PlayPlusParser.ExprCaseEnnemiContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.ENNEMI));
    }

    @Override
    public void exitExprCasePlayer(PlayPlusParser.ExprCasePlayerContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.PLAYER));
    }

    @Override
    public void exitExprCaseMap(PlayPlusParser.ExprCaseMapContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.MAP));
    }

    @Override
    public void exitExprCaseRadio(PlayPlusParser.ExprCaseRadioContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.RADIO));
    }

    @Override
    public void exitExprCaseRadar(PlayPlusParser.ExprCaseRadarContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.RADAR));
    }

    @Override
    public void exitExprCaseAmmo(PlayPlusParser.ExprCaseAmmoContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.AMMO));
    }

    @Override
    public void exitExprCaseFruits(PlayPlusParser.ExprCaseFruitsContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.FRUIT));
    }

    @Override
    public void exitExprCaseSoda(PlayPlusParser.ExprCaseSodaContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.SODA));
    }

    @Override
    public void exitExprCaseGraal(PlayPlusParser.ExprCaseGraalContext ctx) {
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.GRAAL));
    }

    @Override
    public void enterExprCaseNearby(PlayPlusParser.ExprCaseNearbyContext ctx) {
        enterNearBy = true;
    }

    @Override
    public void exitExprCaseNearby(PlayPlusParser.ExprCaseNearbyContext ctx) {
        enterNearBy = false;
        int ind1 = this.stackIndiceNearbyInteger.pop();
        int ind0 = this.stackIndiceNearbyInteger.pop();
        if ((ind0 < 0) || (ind0 > VariableEnvironement.NEARBY.length)) {
            throw new RuntimeException(SymTableException.ERROR_OVERFLOW_INDICE_ROW);
        }
        if ((ind1 < 0) || (ind1 > VariableEnvironement.NEARBY[0].length)) {
            throw new RuntimeException(SymTableException.ERROR_OVERFLOW_INDICE_COL);
        }
        this.stackValeurDouble.push(Double.valueOf(VariableEnvironement.NEARBY[ind0][ind1]));
    }


    /* Operation to return Modulo, Times, PLus, Substract, Divide */
    double makeOperation(Character operation, Double termeD, Double TermeG) {
        double resultat = 0;
        switch (operation) {
            case '%':
                resultat = TermeG % termeD;
                break;
            case '*':
                resultat =  TermeG * termeD;
                break;
            case '+':
                resultat =  TermeG + termeD;
                break;
            case '-':
                resultat =  TermeG - termeD;
                break;

            case '/':
                if (termeD == 0) throw new RuntimeException(SymTableException.ERROR_DIVIDE_BY_ZERO);
                resultat =  TermeG / termeD;
                break;
        }
        return resultat;
    }

    /* Consume value on the stack and Calculate math operation and return the result on the stack */
    void assignOperation(Character operation) {
        if (enterNearBy) {
            Double exprD = stackIndiceNearbyInteger.pop().doubleValue();
            Double exprG = stackIndiceNearbyInteger.pop().doubleValue();
            Integer result = ((Double)makeOperation(operation, exprD, exprG)).intValue();
            this.stackIndiceNearbyInteger.push(result);
        } else {
            if (isLeftEnterArray) {
                Double exprD = stackAssignIndiceArray.removeLast().doubleValue();
                Double exprG = stackAssignIndiceArray.removeLast().doubleValue();
                Integer result = ((Double)makeOperation(operation, exprD, exprG)).intValue();
                this.stackAssignIndiceArray.push(result);
            } else {
                if (!isEnterArray) {
                    Double exprD = stackValeurDouble.pop();
                    Double exprG = stackValeurDouble.pop();
                    Double result = makeOperation(operation, exprD, exprG);
                    this.stackValeurDouble.push(result);
                } else {
                    Double exprD = stackDeclareIndiceArray.removeLast().doubleValue();
                    Double exprG = stackDeclareIndiceArray.removeLast().doubleValue();
                    Integer result = ((Double)makeOperation(operation, exprD, exprG)).intValue();
                    this.stackDeclareIndiceArray.push(result);
                }
            }
        }
    }

    //Modulo entre deux nombres (5%3 par exemple)
    @Override
    public void exitExprDModulo(PlayPlusParser.ExprDModuloContext ctx) {
        assignOperation('%');
    }

    //Division entre deux nombres (5 / 3 par exemple)
    @Override
    public void exitExprDDivide(PlayPlusParser.ExprDDivideContext ctx) {
        assignOperation('/');
    }

    //Multiplication entre deux nombres (5 * 3 par exemple)
    @Override
    public void exitExprDTimes(PlayPlusParser.ExprDTimesContext ctx) {
        assignOperation('*');
    }

    //Soustraction entre deux nombres (5 - 3 par exemple)
    @Override
    public void exitExprDMinus(PlayPlusParser.ExprDMinusContext ctx) {
        assignOperation('-');
    }

    // Addition de deux expressions (5 + 2 par exemple)
    @Override
    public void exitExprDPlus(PlayPlusParser.ExprDPlusContext ctx) {
        assignOperation('+');
    }

    @Override
    public void exitExprDAnd(PlayPlusParser.ExprDAndContext ctx) {

        if (!stackBoolean.isEmpty() && stackBoolean.size()==2) {
            Boolean exprD = stackBoolean.pop();
            Boolean exprG = stackBoolean.pop();
            if (exprD && exprG) {
                this.stackBoolean.push(true);
            } else {
                this.stackBoolean.push(false);
            }

        } else {
            if(!this.stackBoolean.isEmpty()) {
                this.stackBoolean.pop();
            }
        }

    }


    // Comparaison des integers
    // si 6 = 6 alors true on peut comparer des nombres égalemens pas que des integer

    @Override
    public void exitExprDEqual(PlayPlusParser.ExprDEqualContext ctx) {


        if (!stackValeurDouble.isEmpty() && stackValeurDouble.size()==2) {
            Double exprD = stackValeurDouble.pop();
            Double exprG = stackValeurDouble.pop();
            if (exprG == exprD) {
                this.stackBoolean.push(true);
            } else {
                this.stackBoolean.push(false);
            }
        } else {
            if (!stackBoolean.isEmpty() && stackBoolean.size()==2) {
                Boolean exprD = stackBoolean.pop();
                Boolean exprG = stackBoolean.pop();
                if (exprD == exprG) {
                    this.stackBoolean.push(true);
                } else {
                    this.stackBoolean.push(false);
                }
            } else {
                // Ou on a rien trouvé de cohérent
                //  On- vide les piles
                if(!this.stackBoolean.isEmpty()) {
                    this.stackBoolean.pop();
                }
                if(!this.stackValeurDouble.isEmpty()) {
                    this.stackValeurDouble.pop();
                }
            }
        }


    }

    @Override
    public void exitExprDOr(PlayPlusParser.ExprDOrContext ctx) {

        if (!stackBoolean.isEmpty() && stackBoolean.size()==2) {

            Boolean exprD = stackBoolean.pop();
            Boolean exprG = stackBoolean.pop();
            if (exprD || exprG) {
                this.stackBoolean.push(true);
            } else {
                this.stackBoolean.push(false);
            }

        } else {
            if(!this.stackBoolean.isEmpty()) {
                this.stackBoolean.pop();
            }
        }

    }


    // si i2 < 10
    @Override
    public void exitExprDInf(PlayPlusParser.ExprDInfContext ctx) {
        if (!stackValeurDouble.isEmpty() && stackValeurDouble.size()==2) {

            Double exprD = stackValeurDouble.pop();
            Double exprG = stackValeurDouble.pop();
            if (exprG < exprD) {
                this.stackBoolean.push(true);
            } else {
                this.stackBoolean.push(false);
            }

        } else {
            if(!this.stackValeurDouble.isEmpty()) {
                this.stackValeurDouble.pop();
            }
        }



    }


    // si i2 > 10
    @Override
    public void exitExprDSup(PlayPlusParser.ExprDSupContext ctx) {
        if (!stackValeurDouble.isEmpty() && stackValeurDouble.size()==2) {
            Double exprD = stackValeurDouble.pop();
            Double exprG = stackValeurDouble.pop();
            if (exprG > exprD) {
                this.stackBoolean.push(true);
            } else {
                this.stackBoolean.push(false);
            }

        } else {
            if(!this.stackValeurDouble.isEmpty()) {
                this.stackValeurDouble.pop();
            }
        }

    }

    // si not
    @Override
    public void exitExprDNot(PlayPlusParser.ExprDNotContext ctx) {
        if (!stackBoolean.empty()) {
            Boolean exprD = stackBoolean.pop();
            this.stackBoolean.push(!exprD);
        }
    }


    @Override
    public void exitArrayDeclaration(PlayPlusParser.ArrayDeclarationContext ctx) {
        isEnterArray = false;
        // Verification ctx => SCALAR => square et dans ce cas le que deux dimensions
        if ((ctx.NUMBER().size() == 0) || (ctx.NUMBER().size() > 2)) {
            throw new NumberFormatException();
        }
        int dim1 = Integer.parseInt(ctx.NUMBER(0).getText());
        int dim2 = 0;

        // de pas dépasser la taille maximale en INT
        if (dim1 < 0) {
            throw new NumberFormatException();
        }
        if (ctx.NUMBER().size() == 2) {
            dim2 = Integer.parseInt(ctx.NUMBER(1).getText());
            if (dim2 < 0) {
                throw new NumberFormatException();
            }
        }

        // Vecteur initializer
        if ((ctx.SCALAR().getText().equalsIgnoreCase(VariableType.INTEGER)) ||
                (ctx.SCALAR().getText().equalsIgnoreCase(VariableType.SQUARE))) {
            if ((dim1 > 0) && (dim2 == 0)) {
                int[] tmp_vector = new int[dim1];
                declareArray = tmp_vector;
            } else {
                int[][] tmp_array = new int[dim1][dim2];
                declareArray = tmp_array;
            }
        }
        if (ctx.SCALAR().getText().equalsIgnoreCase(VariableType.BOOLEAN)) {
            if ((dim1 > 0) && (dim2 == 0)) {
                boolean[] tmp_vector = new boolean[dim1];
                declareArray = tmp_vector;
            } else {
                boolean[][] tmp_array = new boolean[dim1][dim2];
                declareArray = tmp_array;
            }
        }

/*
        if(stackDeclareIndiceArray != null)
        {
            stackDeclareIndiceArray.removeLast().doubleValue();
        }
        if(stackDeclareIndiceArray != null)
        {
            stackDeclareIndiceArray.removeLast().doubleValue();
        }
*/
    }

    @Override
    public void exitIfcondblock(PlayPlusParser.IfcondblockContext ctx) {
        if (!stackBoolean.isEmpty()) {
            conditionIf = stackBoolean.pop();
        }
    }

    @Override
    public void enterIfThenInstr(PlayPlusParser.IfThenInstrContext ctx) {
        if (conditionIf == false) {
            ctx = RemoveBlockThen(ctx);
            /* Court-circuiter le IF si c'est False */
            /* ne fonctionne pas car il revient la ou il était */
        }
        System.out.println(EMPTY_STRING);
    }

    @Override
    public void enterIfThenElseInstr(PlayPlusParser.IfThenElseInstrContext ctx) {
        if (conditionIf == false) {
            ctx = RemoveBlockThen(ctx);
            /* Court-circuiter le IF si c'est False */
            /* ne fonctionne pas car il revient la ou il était */
        }
    }


    private PlayPlusParser.IfThenInstrContext RemoveBlockThen(PlayPlusParser.IfThenInstrContext ctxBlocThen) {
        int indiceBlocThen = 0;
        boolean childThenDetected = false;
        for (int i = 0; i < ctxBlocThen.children.size(); i++) {
            ParseTree child = ctxBlocThen.children.get(i);
            String childName = child.getText();

            switch (childName) {
                case PilsInstruction.THEN:
                    indiceBlocThen = i + 1;
                    childThenDetected = true;
                    break;
            }

            if (i == indiceBlocThen && childThenDetected == true)
                ctxBlocThen.children.remove(indiceBlocThen);
        }
        return ctxBlocThen;
    }

    private PlayPlusParser.IfThenElseInstrContext RemoveBlockThen(PlayPlusParser.IfThenElseInstrContext ctxBlocThen) {
        int indiceBlocThen = 0;
        boolean childThenDetected = false;
        for (int i = 0; i < ctxBlocThen.children.size(); i++) {
            ParseTree child = ctxBlocThen.children.get(i);
            String childName = child.getText();

            switch (childName) {
                case PilsInstruction.THEN:
                    indiceBlocThen = i + 1;
                    childThenDetected = true;
                    break;
            }

            if (i == indiceBlocThen && childThenDetected == true)
                ctxBlocThen.children.remove(indiceBlocThen);
        }
        return ctxBlocThen;
    }

    @Override
    public void enterIftruecondblock(PlayPlusParser.IftruecondblockContext ctx) {
        if (conditionIf == false) return; // new RuntimeException("break false");
    }


    @Override
    public void exitAffectInstr(PlayPlusParser.AffectInstrContext ctx) {
        try {
            setValue();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void enterImportInstr(PlayPlusParser.ImportInstrContext ctx) {
        if (countImport > 0) throw new RuntimeException(SymTableException.ERROR_ONE_FILE_MAX);
        if (countImport == 0) countImport++;
    }

    /* Clause WHEN */
    @Override public void exitInsideClauseWHEN(PlayPlusParser.InsideClauseWHENContext ctx) {
        if(conditionwhen == false) RemoveBlockWhen(ctx);
    }

    @Override public void exitInsideClauseWHENCond(PlayPlusParser.InsideClauseWHENCondContext ctx) {
        /* Stocke la valeur */
        if (!stackBoolean.isEmpty()) conditionwhen = stackBoolean.pop();
    }

    private PlayPlusParser.InsideClauseWHENContext RemoveBlockWhen(PlayPlusParser.InsideClauseWHENContext ctxBlocWhen) {
        int indiceBlocWhen = 0;
        boolean childThenDetected = false;
        for (int i = 0; i < ctxBlocWhen.children.size(); i++) {
            ParseTree child = ctxBlocWhen.children.get(i);
            String childName = child.getText();

            if (childName.equals(PilsInstruction.WHEN)) {
                indiceBlocWhen = i + 1;
                childThenDetected = true;
            }

            if (i == indiceBlocWhen && childThenDetected == true)
                ctxBlocWhen.children.remove(indiceBlocWhen);
        }
        return ctxBlocWhen;
    }


    @Override public void enterInsideClauseWHENIns(PlayPlusParser.InsideClauseWHENInsContext ctx) {
        if (conditionwhen == false) return;
    }

    /* Function */
    @Override
    public void enterFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx) {
        // Table des symboles locales dans une fonction
        // Sert a trouver les variables locales d'une fonction  (Liste chainée)
        // Table de symboles imbriquées

        /* On crée table locale des symboles dans la fonction */
        enterIDFunction = true;
        localSymTable = Maps.newHashMap();
        enterfunctionname = ctx.ID().getText();
    }

    @Override public void enterFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx) {
        isEnterFctReturn = true;
    }

    @Override public void exitFctdeclreturn(PlayPlusParser.FctdeclreturnContext ctx) {
        isEnterFctReturn = false;
    }

    @Override
    public void exitFctdeclInstr(PlayPlusParser.FctdeclInstrContext ctx) {
        String functionreturntype = PilsInstruction.VOID;
        if (ctx.SCALAR() != null) {
            functionreturntype = ctx.SCALAR().getText();
        }
        VariableModel variableObject = new VariableModel(functionreturntype, enterfunctionname);
        variableObject.setKind(Kind.FUNCTION);
        //Valeur de retour (null par defaut si void)

        if (typeReturnFctTempory != EMPTY_STRING && !typeReturnFctTempory.equalsIgnoreCase(functionreturntype)) {
                throw new RuntimeException(SymTableException.ERROR_MISMATCH_TYPE_RETURN);
        }

        setValueReturnFct(variableObject);

        //Il faut rattacher la table local à la table des symboles.
        variableObject.setValeur(localSymTable);
        symTable.put(enterfunctionname, variableObject);
        enterIDFunction = false;
        enterfunctionname = EMPTY_STRING;
        typeReturnFctTempory = EMPTY_STRING;
    }

    public void setValueReturnFct(VariableModel variableObject) {
        if (!stackValeurDouble.isEmpty()) {
            Double valueObj = stackValeurDouble.pop();
            variableObject.setValueReturn(valueObj);

        } else {
            if (!stackBoolean.isEmpty()) {
                Boolean valueObj = stackBoolean.pop();
                variableObject.setValueReturn(valueObj);
            }
        }
    }


    @Override
    public void exitComputeInstr(PlayPlusParser.ComputeInstrContext ctx) {
        try {
            computeValue();
        } catch (Exception e) {
            throw e;
        }
    }

    private void computeValue() {
        if (!stackValeurDouble.isEmpty() && stackIndiceNearbyInteger.isEmpty()) {
            Double resultat = stackValeurDouble.pop();
        }
        if (!stackBoolean.isEmpty() && stackIndiceNearbyInteger.isEmpty()) {
            Boolean resultat = stackBoolean.pop();
        }
        if (!stackIndiceNearbyInteger.isEmpty()) {
            if (!stackValeurDouble.isEmpty()) {
                Double resultat = stackValeurDouble.pop();
            }
            if (!stackBoolean.isEmpty()) {
                Boolean resultat = stackBoolean.pop();
            }
        }
    }

    @Override
    public void exitExprGID(PlayPlusParser.ExprGIDContext ctx) {
        keySource = ctx.getText();
    }

    @Override
    public void enterExprGArray(PlayPlusParser.ExprGArrayContext ctx) {
        isLeftEnterArray = true;
    }

    @Override
    public void exitExprGArray(PlayPlusParser.ExprGArrayContext ctx) {
        keySource = ctx.ID().getText();
        keySourceComplete = ctx.getText();
        isLeftEnterArray = false;
    }

    @Override
    public void enterExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx) {
        ParseTree childNameFunction = ctx.children.get(0);
        String nameFunction = childNameFunction.getText();

        //Si en cours de déclaration sortir et ne pas exécuter
        boolean functionCallSelf = enterfunctionname.equalsIgnoreCase(nameFunction);
        if (!functionCallSelf) {
            if(!IsFunctionDeclared(nameFunction)) throw new RuntimeException(SymTableException.ERROR_FUNCTION_NOT_DECLARED);
        }

    }

    @Override
    public void exitExprDLPARExprDRPAR(PlayPlusParser.ExprDLPARExprDRPARContext ctx) {
        if (ctx.ID() != null) {
            int indice1 = -1;
            int indice2 = -1;
            getValueFromSymbolTable(ctx.ID().getText(), indice1, indice2);
        }
    }

    private boolean IsFunctionDeclared(String nameFunction) {
        return symTable.get(nameFunction) != null;
    }

    private void setValue() {
        VariableModel objLocal = null;
        if (enterIDFunction && (localSymTable != null) && (localSymTable.containsKey(keySource))) {
            objLocal = localSymTable.get(keySource);
        }
        if ((objLocal == null) && (symTable != null) && (symTable.containsKey(keySource)))
            objLocal = symTable.get(keySource);
        if (objLocal != null) {

            if (objLocal.getType().equalsIgnoreCase(VariableType.INTEGER)) {
                Integer resultat = (int) Math.round(stackValeurDouble.pop());
                objLocal.setValeur(resultat);
            }
            if (objLocal.getType().equalsIgnoreCase(VariableType.BOOLEAN)) {
                if (keySourceComplete != EMPTY_STRING) throw new RuntimeException(SymTableException.ERROR_INCORRECT_ASSIGN_TYPE_ARRAY);
                if(!stackBoolean.isEmpty()) {
                    Boolean resultat = stackBoolean.pop();
                    objLocal.setValeur(resultat);
                } else {
                    throw new RuntimeException(SymTableException.ERROR_INCORRECT_BOOLEAN_MISTAKE);
                }
            }
            if (objLocal.getType().equalsIgnoreCase(VariableType.VECTOR)) {
                Object tmp = objLocal.getValeur();
                int indDim1 = stackAssignIndiceArray.isEmpty() ? -1 : stackAssignIndiceArray.remove();
                assignValueToStackBoolean(tmp, indDim1);
                assignValueToVector(tmp, indDim1);
            }
            if (objLocal.getType().equalsIgnoreCase(VariableType.ARRAY)) {
                Object tmp = objLocal.getValeur();
                int indDim1 = stackAssignIndiceArray.isEmpty() ? -1 : stackAssignIndiceArray.removeLast();
                int indDim2 = stackAssignIndiceArray.isEmpty() ? -1 : stackAssignIndiceArray.removeLast();

               assignValueToArray(tmp, indDim1, indDim2);
            }
        } else {
            throw new RuntimeException(SymTableException.ERROR_NO_AFFECT_FCT);
        }
    }

    /* assign value to boolean */
    public void assignValueToStackBoolean(Object tmp,int dim1){
        if (tmp.getClass().getComponentType().getComponentType() != null) {
            if (tmp.getClass().getComponentType().getComponentType().getName().equalsIgnoreCase(VariableType.BOOLEAN)) {
                boolean[] tmpint = (boolean[]) tmp;
                Boolean resultat = stackBoolean.pop();
                tmpint[dim1] = resultat;
            }
        }
    }

    /* assign value to a vector, an array with one dimension */
    public void assignValueToVector(Object tmp,int dim1){
        if (tmp.getClass().getComponentType().equals(int.class)) {
            int[] tmpint = (int[]) tmp;
            Integer resultat = (int) Math.round(stackValeurDouble.pop());
            tmpint[dim1] = resultat;
        }
        if (tmp.getClass().getComponentType().equals(boolean.class)) {
            boolean[] tmpint = (boolean[]) tmp;
            Boolean resultat = stackBoolean.pop();
            tmpint[dim1] = resultat;
        }
    }

    /* assign value to an array with two dimension */
    public void assignValueToArray(Object tmp,int dim1, int dim2){
        if (tmp.getClass().getComponentType().equals(int[].class)) {

            /* Verifier la pile des  boolean */
            /*  S'il y a quelque chose mettre une exceptiopn */
            //throw new RuntimeException(SymTableException.ERROR_INCORRECT_ASSIGN_TYPE_ARRAY):
            if(stackValeurDouble.isEmpty()) {
                throw new RuntimeException(SymTableException.ERROR_INCORRECT_ASSIGN_TYPE_ARRAY);
            }

            int[][] tmpint = (int[][]) tmp;
            Integer resultat = (int) Math.round(stackValeurDouble.pop());
            tmpint[dim1][dim2] = resultat;
        }
        if (tmp.getClass().getComponentType().equals(boolean[].class)) {

            /* Verifier la pile des  double */
            /*  S'il y a quelque chose mettre une exceptiopn */
            //throw new RuntimeException(SymTableException.ERROR_INCORRECT_ASSIGN_TYPE_ARRAY):
            if(stackBoolean.isEmpty()) {
                throw new RuntimeException(SymTableException.ERROR_INCORRECT_ASSIGN_TYPE_ARRAY);
            }
            boolean[][] tmpint = (boolean[][]) tmp;
            Boolean resultat = stackBoolean.pop();
            tmpint[dim1][dim2] = resultat;
        }
    }


    public Map<String, VariableModel> getSymTable() {
        return symTable;
    }

}
