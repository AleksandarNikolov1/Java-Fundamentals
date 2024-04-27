package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String modelOfTheBiggestKeg = "";
        double volume = 0;
        double maxVolume = Double.MIN_VALUE;

        while (n -- > 0){
            String modelKeg = sc.nextLine();
            double radiusKeg = Double.parseDouble(sc.nextLine());
            int heightKeg = Integer.parseInt(sc.nextLine());

            volume = Math.PI * Math.pow(radiusKeg, 2) * (double) heightKeg;

            if (volume > maxVolume) {
                maxVolume = volume;
                modelOfTheBiggestKeg = modelKeg;
            }
        }

        System.out.println(modelOfTheBiggestKeg);
    }
}
