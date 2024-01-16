package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class MultiplicationTable_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());

        for (int b = 1; b <= 10; b++) {
            System.out.printf("%d X %d = %d%n", a, b, a * b);
        }
    }
}
