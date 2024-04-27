package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P10_PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pokePower = Integer.parseInt(sc.nextLine());
        int distanceToTarget = Integer.parseInt(sc.nextLine());
        int exhaustionFactor = Integer.parseInt(sc.nextLine());

        int targetsCount = 0;
        int initialPokePower = pokePower;

        while (pokePower >= distanceToTarget){

            pokePower -= distanceToTarget;
            targetsCount++;


            if (pokePower == (double) initialPokePower / 2 && exhaustionFactor != 0)
                pokePower /= exhaustionFactor;

        }

        System.out.println(pokePower);
        System.out.println(targetsCount);
    }
}
