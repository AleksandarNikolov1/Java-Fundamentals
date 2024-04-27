package L04_Methods.Exercise;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        printMiddleOfStr(input);
    }

    private static void printMiddleOfStr (String str){
        if (str.length() % 2 == 0){
            System.out.println(str.charAt(str.length() / 2 - 1) + "" + str.charAt(str.length() / 2) + "");
        }

        else
            System.out.println(str.charAt(str.length() / 2));
    }
}
