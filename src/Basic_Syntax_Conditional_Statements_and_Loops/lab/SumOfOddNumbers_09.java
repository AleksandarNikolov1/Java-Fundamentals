package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = 1; i <= n * 2; i += 2) {

            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum: " + sum);

    }
}
