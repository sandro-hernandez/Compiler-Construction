import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        runFile(args[0]);
    }
    private static void runFile(String path) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get(path));
        SPLPrime prime = new SPLPrime(inputStream);

        for (Token running = SPLPrime.getNextToken();
             running != null && running.kind!=0;
             running = SPLPrime.getNextToken()) {

            System.out.println("(" + toString(running) +", " + running + "), Line: " + running.beginLine);
        }
    }

    public static String toString(Token t) {
        switch (t.kind) {
            case 0: return "EOF";
            case 6: return "Number";
            case 7: return "LEFT_PAREN";
            case 8: return "RIGHT_PAREN";
            case 9: return "LEFT_BRACE";
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
        return "";
    }
}