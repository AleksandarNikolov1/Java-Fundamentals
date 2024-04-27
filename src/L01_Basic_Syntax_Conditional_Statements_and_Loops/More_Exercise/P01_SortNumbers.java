package L01_Basic_Syntax_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P01_SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        if (a > b && a > c){
            System.out.println(a);
            System.out.println(Math.max(b, c));
            System.out.println(Math.min(b, c));
        }
        else if (b > a && b > c){
            System.out.println(b);
            System.out.println(Math.max(a, c));
            System.out.println(Math.min(a, c));
        }
        else {
            System.out.println(c);
            System.out.println(Math.max(a, b));
            System.out.println(Math.min(a, b));
        }
    }
}
