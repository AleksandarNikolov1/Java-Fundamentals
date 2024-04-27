package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tankCapacity = 255;

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){

            int litersOfWater = Integer.parseInt(sc.nextLine());

            if (tankCapacity - litersOfWater >= 0)
                tankCapacity -= litersOfWater;

            else
                System.out.println("Insufficient capacity!");
        }

        System.out.println(255 - tankCapacity);
    }
}
