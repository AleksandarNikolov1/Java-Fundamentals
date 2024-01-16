package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class ConvertMetersToKilometers_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());

        double km = (double) meters / 1000;

        System.out.printf("%.2f", km);
    }
}
