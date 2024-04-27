package L02_Data_Types_and_Variables.More_Exercise;

import java.util.Scanner;

public class P04_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int number = 2; number <= n; number++) {

            boolean isPrime = true;
            for (int divisor = 2; divisor < number; divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", number, isPrime);
        }
    }
}
