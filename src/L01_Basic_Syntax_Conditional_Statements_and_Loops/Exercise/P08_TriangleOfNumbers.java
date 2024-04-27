package L01_Basic_Syntax_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
