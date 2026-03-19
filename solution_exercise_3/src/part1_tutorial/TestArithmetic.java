package part1_tutorial;

import java.io.StringReader;

import part2_splprime.SPLPrime;
import part2_splprime.Token;

public class TestArithmetic {
    public static void main(String[] args) throws ParseException {
        String input = "3+4*5";
        Arithmetic parser = new Arithmetic(new StringReader(input));
//        parser.expr();
        parser.start();
        System.out.println("Input parsed successfully.");
    }
}