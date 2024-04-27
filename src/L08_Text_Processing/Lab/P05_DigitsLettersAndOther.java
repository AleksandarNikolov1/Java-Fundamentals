package L08_Text_Processing.Lab;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String digits = "";
        String letters = "";
        String otherSymbols = "";

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);

            if (Character.isDigit(currentSymbol))
                digits = digits.concat(String.valueOf(currentSymbol));

            else if (Character.isLetter(currentSymbol))
                letters = letters.concat(String.valueOf(currentSymbol));

            else if (!Character.isLetterOrDigit(currentSymbol))
                otherSymbols = otherSymbols.concat(String.valueOf(currentSymbol));
        }
    }
}
