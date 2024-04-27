package L01_Basic_Syntax_Conditional_Statements_and_Loops.Exercise;

import java.io.IOException;
import java.util.Scanner;

public class P09_PadawanEquipments {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int studentsCount = Integer.parseInt(sc.nextLine());
        double sabrePrice = Double.parseDouble(sc.nextLine());
        double robePrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        int sabresCount = (int) Math.ceil(studentsCount * 1.1);

        double beltsDiscount = studentsCount / 6 * beltPrice;

        double totalCost = studentsCount * (robePrice + beltPrice) + sabrePrice * (double) sabresCount - beltsDiscount;

        double diff = totalCost - budget;

        if (budget > totalCost)
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);

        else
            System.out.printf("George Lucas will need %.2flv more.", diff);
    }
}


