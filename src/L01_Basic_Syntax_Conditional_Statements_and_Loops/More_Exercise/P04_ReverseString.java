package L01_Basic_Syntax_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P04_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.reverse().toString());
    }
}
