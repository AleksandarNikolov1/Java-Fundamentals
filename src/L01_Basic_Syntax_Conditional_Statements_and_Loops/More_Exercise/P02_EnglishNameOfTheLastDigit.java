package L01_Basic_Syntax_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P02_EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String result = lastDigitToString(n);

        System.out.println(result);

    }

    public static String lastDigitToString (int num){

        char lastDigit = String.valueOf(num).charAt(String.valueOf(num).length() - 1);
        String output = "";

        switch (lastDigit){
            case '0': output = "zero";
                break;
            case '1': output = "one";
                break;
            case '2': output = "two";
                break;
            case '3': output = "three";
                break;
            case '4': output = "four";
                break;
            case '5': output = "five";
                break;
            case '6': output = "six";
                break;
            case '7': output = "seven";
                break;
            case '8': output = "eight";
                break;
            case '9': output = "nine";
                break;
        }
        return output;
    }
}
