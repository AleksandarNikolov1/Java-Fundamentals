package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class ReversedChars_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char symbol = sc.nextLine().charAt(0);
            sb.append(symbol).append(" ");
        }

        System.out.println(sb.reverse().toString());
    }
}
