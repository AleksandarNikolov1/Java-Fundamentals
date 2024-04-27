package L01_Basic_Syntax_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P05_Messages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        while (n -- > 0){

            int num = Integer.parseInt(sc.nextLine());

            if (num == 2)
                sb.append("a");
            else if (num == 22)
                sb.append("b");
            else if (num == 222)
                sb.append("c");
            else if (num == 3)
                sb.append("d");
            else if (num == 33)
                sb.append("e");
            else if (num == 333)
                sb.append("f");
            else if (num == 4)
                sb.append("g");
            else if (num == 44)
                sb.append("h");
            else if (num == 444)
                sb.append("i");
            else if (num == 5)
                sb.append("j");
            else if (num == 55)
                sb.append("k");
            else if (num == 555)
                sb.append("l");
            else if (num == 6)
                sb.append("m");
            else if (num == 66)
                sb.append("n");
            else if (num == 666)
                sb.append("o");
            else if (num == 7)
                sb.append("p");
            else if (num == 77)
                sb.append("q");
            else if (num == 777)
                sb.append("r");
            else if (num == 7777)
                sb.append("s");
            else if (num == 8)
                sb.append("t");
            else if (num == 88)
                sb.append("u");
            else if (num == 888)
                sb.append("v");
            else if (num == 9)
                sb.append("w");
            else if (num == 99)
                sb.append("x");
            else if (num == 999)
                sb.append("y");
            else if (num == 9999)
                sb.append("z");
            else if (num == 0)
                sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
