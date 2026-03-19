import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/sandra/git/seg/lectures/compilerconstruction/exercises/02-handwritten-scanner/inputs/sample.spl";
        runFile(filePath);

    }
    private static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        InputStream inputStream = Files.newInputStream(Paths.get(path));
        SPLPrime prime = new SPLPrime(inputStream);
        Token running = SPLPrime.getNextToken();
        while (running != null && running.kind!=0) {
            System.out.println("(" + toString(running) +", " +running + "), Line: " + running.beginLine);
            running = SPLPrime.getNextToken();
        }
    }

    public static String toString(Token t) {
        int i = t.kind;
        switch (i) {
            case 0: return "EOF";
            case 6: return "Number";
            case 7: return "LEFT_PAREN";
            case 8: return "RIGHT_PAREN";
            case 9: return "LEFTT_BRACE";
            case 10: return "RIGHT_BRACE";

            case 11: return "MINUS";
            case 12: return "PLUS";
            case 13: return "MULT";
            case 14: return "DIF";
            case 15: return "SEMICOL";
            case 16: return "NOTEQUALS";
            case 17: return "NOT";
            case 18: return "EQUAL_EQUAL";
            case 19: return "EQUAL";

            case 20: return "GREATER_EQUAL";
            case 21: return "GREATER";
            case 22: return "LESS_EQUAL";
            case 23: return "LESS";
            case 24: return "AND";
            case 25:return "ELSE";
            case 26: return "FALSE";
            case 27: return "TRUE";
            case 28: return "IF";
            case 29: return "OR";

            case 30: return "PRINT";
            case 31: return "VAR";
            case 32: return "WHILE";
            case 33: return "IDENTIFIER";
            case 34: return "STRING";
        }
        /** RegularExpression Id. */
        int LEFTT_BRACE = 8;
        /** RegularExpression Id. */
        int RIGHT_BRACE = 9;
        /** RegularExpression Id. */
        int MINUS = 10;
        /** RegularExpression Id. */
        int PLUS = 11;
        /** RegularExpression Id. */
        int MULT = 12;
        /** RegularExpression Id. */


        /** RegularExpression Id. */
        int NOT = 16;
        /** RegularExpression Id. */
        int EQUAL_EQUAL = 17;
        /** RegularExpression Id. */
        int EQUAL = 18;
        /** RegularExpression Id. */
        int GREATER_EQUAL = 19;
        /** RegularExpression Id. */
        int GREATER = 20;
        /** RegularExpression Id. */
        int LESS_EQUAL = 21;
        /** RegularExpression Id. */
        int LESS = 22;
        /** RegularExpression Id. */
        int AND = 23;
        /** RegularExpression Id. */
        int ELSE = 24;
        /** RegularExpression Id. */
        int FALSE = 25;
        /** RegularExpression Id. */
        int TRUE = 26;
        /** RegularExpression Id. */
        int IF = 27;
        /** RegularExpression Id. */
        int OR = 28;
        /** RegularExpression Id. */
        int PRINT = 29;
        /** RegularExpression Id. */


        return "";
    }
}
