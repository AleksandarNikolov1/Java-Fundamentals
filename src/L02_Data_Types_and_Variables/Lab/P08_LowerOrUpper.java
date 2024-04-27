package L02_Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        if (c > 96 && c < 123)
            System.out.println("lower-case");
        else
            System.out.println("upper-case");
    }
}
