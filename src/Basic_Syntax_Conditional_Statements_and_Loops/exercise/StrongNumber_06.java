package Basic_Syntax_Conditional_Statements_and_Loops.exercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numAsString = sc.nextLine();

        int sumOfFactorials = 0;

        for (int i = 0; i < numAsString.length(); i++) {
            int num = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
            int fact = 1;

            if (num > 0) {
                for (int j = 1; j <= num; j++) {
                    fact = fact * j;
                }
            }

            sumOfFactorials += fact;
        }

        if (sumOfFactorials == Integer.parseInt(numAsString))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
