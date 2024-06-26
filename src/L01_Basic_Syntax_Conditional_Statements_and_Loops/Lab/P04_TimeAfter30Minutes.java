package L01_Basic_Syntax_Conditional_Statements_and_Loops.Lab;

import java.util.Scanner;

public class P04_TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());

        m += 30;

        if (m > 60){
            h += 1;
            m -= 60;
        }

        if (h == 24)
            h = 0;

        if (m < 10)
            System.out.printf("%d:0%d", h, m);

        else
            System.out.printf("%d:%d", h, m);
    }
}
