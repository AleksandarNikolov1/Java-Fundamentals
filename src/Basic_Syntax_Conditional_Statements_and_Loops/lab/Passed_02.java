package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class Passed_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3)
            System.out.println("Passed!");

    }
}
