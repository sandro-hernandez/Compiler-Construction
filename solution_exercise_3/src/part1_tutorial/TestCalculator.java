package part1_tutorial;

import java.io.StringReader;

public class TestCalculator {
    public static void main(String[] args) throws ParseException {
        String input = "3+4*5";
        Arithmetic parser = new Arithmetic(new StringReader(input));
        double result = parser.start();
        System.out.println("Result = " + result);
    }
}