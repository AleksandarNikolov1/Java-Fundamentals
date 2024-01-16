package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int number = 1; number <= n; number++) {

            int temp = number;

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            boolean isSpecial = (sum == 5) || (sum == 7) || (sum == 11);

            if (isSpecial)
            System.out.printf("%d -> True%n", temp);

            else
                System.out.printf("%d -> False%n", temp);

            sum = 0;
            number = temp;
        }
    }
}
