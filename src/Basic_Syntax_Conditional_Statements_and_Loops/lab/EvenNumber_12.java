package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (true) {

            if (n % 2 == 0) {
                System.out.println("The number is: " + Math.abs(n));
                break;
            }

            System.out.println("Please write an even number.");
            n = Integer.parseInt(sc.nextLine());
        }
    }
}


