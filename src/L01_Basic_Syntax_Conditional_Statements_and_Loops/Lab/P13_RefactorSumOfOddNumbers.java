package L01_Basic_Syntax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P13_RefactorSumOfOddNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for (int i = 1; i <= n * 2; i+=2) {

            System.out.println(i);

            sum += i;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
