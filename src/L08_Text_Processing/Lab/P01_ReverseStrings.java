package L08_Text_Processing.Lab;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String input = sc.nextLine();

            if (input.equals("end"))
                break;

            String reversedString = "";

            for (int i = input.length() - 1; i >= 0; i--) {
                reversedString = reversedString.concat(String.valueOf(input.charAt(i)));
            }

            System.out.printf("%s = %s%n", input, reversedString);
        }
    }
}
