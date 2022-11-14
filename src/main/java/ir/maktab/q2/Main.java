package ir.maktab.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            Integer output = getIntegerFromString(input);
            System.out.println(output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer getIntegerFromString(String input) throws OutOfRangException, InvalidInputException {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                throw new InvalidInputException("invalid input with whitespace");
            }
        }
        Integer output;
        try {
            output = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            throw new InvalidInputException("invalid input");
        }
        if (output < -32767 || output > 32767) {
            throw new OutOfRangException("integer is out of rang");
        }
        return output;
    }
}
