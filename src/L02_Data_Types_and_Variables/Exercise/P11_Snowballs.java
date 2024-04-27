package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int madeSnowballsCount = Integer.parseInt(sc.nextLine());

        double highestSnowballValue = 0.0;

        int fSnowballSnow = 0;
        int fSnowballTime = 0;
        int fSnowballValue = 0;

        while (madeSnowballsCount -- > 0){
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());

            double snowballValue = Math.pow(((double)snowballSnow / (double)snowballTime) , snowballQuality);

            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                fSnowballSnow = snowballSnow;
                fSnowballTime = snowballTime;
                fSnowballValue = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", fSnowballSnow, fSnowballTime, highestSnowballValue, fSnowballValue);
    }
}
