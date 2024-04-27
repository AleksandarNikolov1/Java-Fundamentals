package L01_Basic_Syntax_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P10_RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int brokenKeyboardsCount = 0;

        double rageExpenses = 0.0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0 && i % 3 == 0) {
                rageExpenses += keyboardPrice;
                rageExpenses += headsetPrice;
                rageExpenses += mousePrice;
                brokenKeyboardsCount ++;
            }
            else if (i % 2 == 0)
                rageExpenses += headsetPrice;

            else if (i % 3 == 0)
                rageExpenses += mousePrice;
        }

        brokenKeyboardsCount /= 2;

        displayPrice *= brokenKeyboardsCount;

        rageExpenses += displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
