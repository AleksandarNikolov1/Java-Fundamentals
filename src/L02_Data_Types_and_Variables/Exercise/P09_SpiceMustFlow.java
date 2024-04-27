package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startingYield = Integer.parseInt(sc.nextLine());
        int extractedSpice = 0;
        int daysCount = 0;

        while (startingYield >= 100){

            extractedSpice += startingYield - 26;
            startingYield -= 10;

            daysCount++;
        }

        if (extractedSpice > 26)
            extractedSpice -= 26;

        System.out.println(daysCount);
        System.out.println(extractedSpice);
    }
}
