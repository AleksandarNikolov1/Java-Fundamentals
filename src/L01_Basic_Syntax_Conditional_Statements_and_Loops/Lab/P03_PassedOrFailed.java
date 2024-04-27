package L01_Basic_Syntax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P03_PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3)
            System.out.println("Passed!");

        else
            System.out.println("Failed!");
    }
}
