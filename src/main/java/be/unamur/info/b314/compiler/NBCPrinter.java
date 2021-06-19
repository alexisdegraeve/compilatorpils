package be.unamur.info.b314.compiler;

import com.google.common.base.Preconditions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 *
 */
public class NBCPrinter {

    public enum NBCCodeTypes {
        Int("sdword"), Char("sbyte"), Bool("byte");

        private final String representation;

        private NBCCodeTypes(String r) {
            representation = r;
        }

    }

    private final PrintWriter writer;

    public NBCPrinter(File outFile) throws FileNotFoundException {
        writer = new PrintWriter(outFile);
    }

    public NBCPrinter(String fileName) throws FileNotFoundException {
        writer = new PrintWriter(fileName);
    }

    public NBCPrinter(OutputStream out) {
        writer = new PrintWriter(out);
    }


    public void printLoadConstant(NBCCodeTypes type, int value) {
        writer.printf("ldc %s %d", type.representation, value).println();
    }

    public void printLoadAdress(String var, int nvar) {
        writer.printf("mov %s %d", var, nvar).println();
    }


    public void printLoad(NBCCodeTypes type,  String  var) {
        writer.printf("%s %s", var, type.representation).println();
    }

    /* Assign value */
    public void printAssignVariable(String variableName, String value) {
        String outputvalue = value;
        if(value.equalsIgnoreCase("true")) {
            outputvalue = "1";
        }
        if(value.equalsIgnoreCase("false")) {
            outputvalue = "0";
        }
        writer.printf("set  %s, %s ", variableName, outputvalue).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableVector(String variableName, int index, int value) {
        writer.printf("replace  %s, %s, %d, %d ", variableName, variableName, index, value).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableArray(String variableName, int index, int index2, int value) {
        writer.printf("replace  %s, %s, %d, %d ", variableName, variableName, index2, value).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableAdd(String valueSrc1, String valueSrc2, String valueDest) {
        writer.printf("add  %s, %s, %s ", valueDest, valueSrc1, valueSrc2).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableSub(String valueSrc1, String valueSrc2, String valueDest) {
        writer.printf("sub  %s, %s, %s ", valueDest, valueSrc1, valueSrc2).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableTimes(String valueSrc1, String valueSrc2, String valueDest) {
        writer.printf("mul  %s, %s, %s ", valueDest, valueSrc1, valueSrc2).println(); //	Set i, 2 par exemple
    }

    public void printAssignVariableDivide(String valueSrc1, String valueSrc2, String valueDest) {
        writer.printf("div  %s, %s, %s ", valueDest, valueSrc1, valueSrc2).println(); //	Set i, 2 par exemple
    }

    /* Declaration variable */
    public void printDeclareVariable(String variableName, PlayPlusParser.TypeContext type) {
        String typeOutput = "";
        String typeVariable = "";
        String arrayLength01 = "";
        String arrayLength02 = "";
        if(type.array() != null) {
            if(type.array().getChild(0) !=null) {
                typeVariable = type.array().getChild(0).getText();
            }
            if(type.array().getChild(2) !=null) {
                arrayLength01 = type.array().getChild(2).getText();;
            }
            if(type.array().getChild(4) !=null) {
                arrayLength02 = type.array().getChild(4).getText();
            }
        }

        if(type.SCALAR() != null) {
            typeVariable = type.SCALAR().getText();
        }

        if(typeVariable != "") {
            switch(typeVariable) {
                case "square":
                case "integer":
                    typeOutput = "word";
                    break;
                case "boolean":
                    typeOutput = "byte";
                    break;
                default:
            }
        }
        if(arrayLength01 != "") {
            typeOutput += "[]";
        }
        if(arrayLength02 != "") {
            typeOutput += "[]";
        }

        writer.printf("   %s %s", variableName, typeOutput).println();
    }

    public void printThreadMain() {
        writer.printf("thread main").println();
    }


    public void printEndThreadMain() {
        writer.printf("endt").println();
    }


    public void printInitializeConfig() {
        writer.printf("#define ROT_DEG %d", SetupNBC.ROT_DEG).println(); //	Motor degrees	TURN
        writer.printf("#define FWD_DEG %d", SetupNBC.FWD_DEG).println();
        writer.printf("#define SPEED %d", SetupNBC.SPEED).println();
        writer.printf("#define WAIT %d", SetupNBC.WAIT).println();
        writer.printf("#define NEAR %d", SetupNBC.NEAR).println();
    }

    public void printDsegSegment() {
        writer.printf("dseg segment").println();
    }

    public void printEndDsegSegment() {
        writer.printf("dseg ends").println();
    }

    // next shoot north
    public void printShootNorth() {
        writer.printf("PlayTone(TONE_C5,500)").println();
        writer.printf("wait 500").println();
    }

    // next shoot north
    public void printShootSouth() {
        writer.printf("PlayTone(TONE_D5,500)").println();
        writer.printf("wait 500").println();
    }

    // next shoot east
    public void printShootEast() {
        writer.printf("PlayTone(TONE_E3,500)").println();
        writer.printf("wait 500").println();
    }

    // next shoot west
    public void printShootWest() {
        writer.printf("PlayTone(TONE_B7,500)").println();
        writer.printf("wait 500").println();
    }

    public void printEmpty() {
        writer.println("");
    }


    public void printStop() {
        writer.println("");
    }

    public void printFirstLine() {
        writer.printf("#include \"NXTDefs.h\" ").println();
    }

    public void printComments(String comment) {
        writer.printf("// %s", comment).println();
    }


    public void printAdd(NBCCodeTypes type, String nvar, int value) {
        Preconditions.checkArgument(type.equals(NBCCodeTypes.Int));
        writer.printf("add %s %d  ",  nvar, value).println();
    }

    public void printSub(NBCCodeTypes type, String nvar, int value) {
        Preconditions.checkArgument(type.equals(NBCCodeTypes.Int) );
        writer.printf("sub %s %d ", nvar, value).println();
    }



    // while
    public void printWhile(int countLoop, int maxCountLoop) {
        writer.println("dseg segment");
        writer.printf("     loopCount%d byte", countLoop).println();
        writer.println("dsseg ends");
        writer.printf("set loopCount%d,%d", countLoop, maxCountLoop).println();
        writer.printf("DoLoop%d:", countLoop).println();
    }
    public void printDoneWhile(int countLoop) {
        writer.printf("sub loopCount%d,loopCount%d,1", countLoop, countLoop).println();
        writer.printf("brtst GT, DoLoop%d, loopCount%d", countLoop, countLoop).println();
    }



    public void flush() {
        writer.flush();
    }

    public void close() {
        writer.flush();
        writer.close();
    }

}
