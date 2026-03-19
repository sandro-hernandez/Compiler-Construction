package part2_splprime;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestSPLPrime {

	public static void main(String[] args) throws Exception {

		String path = "input/sample.spl";
		InputStream input = new FileInputStream(path);
		
	    SPLPrime parser = new SPLPrime(input);

	    Token t;

	    do {
	        t = SPLPrime.getNextToken();
	        System.out.println(t.image + " -> " + t.kind);
	        System.out.println(t.image + " -> " + t.kind + " -> " + toString(t));

	    } while (t.kind != 0); // EOF
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
        return "";
	}   
}

