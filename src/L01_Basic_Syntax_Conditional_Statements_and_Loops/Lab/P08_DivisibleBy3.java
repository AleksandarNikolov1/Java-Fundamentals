package L01_Basic_Syntax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P08_DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 3; i <= 100; i+=3) {
            System.out.println(i);
        }
    }
}
