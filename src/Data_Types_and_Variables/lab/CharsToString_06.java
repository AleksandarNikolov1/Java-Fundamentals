package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class CharsToString_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstChar = sc.nextLine().charAt(0);
        char secondChar = sc.nextLine().charAt(0);
        char thirdChar = sc.nextLine().charAt(0);

        String output = String.valueOf(firstChar) + String.valueOf(secondChar) + String.valueOf(thirdChar);

        System.out.println(output);
    }
}