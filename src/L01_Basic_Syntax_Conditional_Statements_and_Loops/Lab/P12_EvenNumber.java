package L01_Basic_Syntax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P12_EvenNumber {
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


