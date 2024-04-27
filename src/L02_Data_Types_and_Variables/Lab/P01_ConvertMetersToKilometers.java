package L02_Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P01_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());

        double km = (double) meters / 1000;

        System.out.printf("%.2f", km);
    }
}
