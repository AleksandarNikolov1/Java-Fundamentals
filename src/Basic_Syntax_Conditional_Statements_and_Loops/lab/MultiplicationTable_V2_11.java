package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class MultiplicationTable_V2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int i = Integer.parseInt(sc.nextLine());

        if (i <= 10) {
            for (int b = i; b <= 10; b++) {
                System.out.printf("%d X %d = %d%n", a, b, a * b);
            }
        }

        else
            System.out.printf("%d X %d = %d", a, i, a * i);
    }
}
