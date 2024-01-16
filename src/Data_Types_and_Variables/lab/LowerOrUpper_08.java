package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        if (c > 96 && c < 123)
            System.out.println("lower-case");
        else
            System.out.println("upper-case");
    }
}
