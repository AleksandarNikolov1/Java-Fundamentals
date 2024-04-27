package L02_Data_Types_and_Variables.More_Exercise;

import java.util.Scanner;

public class P03_FloatingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstDouble = Double.parseDouble(sc.nextLine());
        double secondDouble = Double.parseDouble(sc.nextLine());

        double epsilon = 0.000001d;

        boolean areEquals = Math.abs(firstDouble - secondDouble) <= epsilon;

        if (areEquals)
            System.out.println("True");

        else
            System.out.println("False");

    }
}
