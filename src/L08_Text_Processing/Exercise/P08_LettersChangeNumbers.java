package L08_Text_Processing.Exercise;

import java.util.Scanner;

public class P08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        double result = 0;

        for (int i = 0; i < input.length; i++) {
            String currentStr = input[i];
            char firstChar = currentStr.charAt(0);
            char secondChar = currentStr.charAt(currentStr.length() - 1);

            int num = Integer.parseInt(currentStr.substring(1, currentStr.length() - 1));

            double f = getTheOrderNumOfLetterInAlphabet(firstChar);
            double s = getTheOrderNumOfLetterInAlphabet(secondChar);

            if (Character.isUpperCase(firstChar))
                result += num * 1.0 / f;

            else
                result += num * f;

            if (Character.isUpperCase(secondChar))
                result -= s;

            else
                result += s;

        }


        System.out.printf("%.2f", result);
    }

    private static int getTheOrderNumOfLetterInAlphabet(char c) {

        int result = 0;

        char[] lowerCaseAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperCaseAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        if (Character.isUpperCase(c)) {
            for (int i = 0; i < upperCaseAlphabet.length; i++) {
                if (c == upperCaseAlphabet[i])
                    result = i + 1;
            }
        } else
            for (int i = 0; i < lowerCaseAlphabet.length; i++) {
                if (c == lowerCaseAlphabet[i])
                    result = i + 1;
            }

        return result;

    }
}
