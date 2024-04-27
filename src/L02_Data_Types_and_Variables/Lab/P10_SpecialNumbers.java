package L02_Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {

            String numAsString = String.valueOf(i);

            int sum = 0;

            for (int j = 0; j < numAsString.length(); j++) {
                int digit = Integer.parseInt(String.valueOf(numAsString.charAt(j)));
                sum += digit;
            }

            if (sum == 5 || sum == 7 || sum == 11)
                System.out.printf("%d -> True%n", i);

            else
                System.out.printf("%d -> False%n", i);
        }
    }
}
