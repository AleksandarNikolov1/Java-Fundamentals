package L01_Basic_Syntax_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleCount = Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String dayOfWeek = sc.nextLine();

        double price = 0.0;

        if (dayOfWeek.equals("Friday")){
            if (typeOfGroup.equals("Students"))
                price = 8.45;

            else if (typeOfGroup.equals("Business"))
                price = 10.90;

            else if (typeOfGroup.equals("Regular"))
                price = 15;
        }

        else if (dayOfWeek.equals("Saturday")){
            if (typeOfGroup.equals("Students"))
                price = 9.80;

            else if (typeOfGroup.equals("Business"))
                price = 15.60;

            else if (typeOfGroup.equals("Regular"))
                price = 20;
        }

        else if (dayOfWeek.equals("Sunday")){
            if (typeOfGroup.equals("Students"))
                price = 10.46;

            else if (typeOfGroup.equals("Business"))
                price = 16;

            else if (typeOfGroup.equals("Regular"))
                price = 22.50;
        }

        double totalPrice = peopleCount * price;

        if (typeOfGroup.equals("Students") && peopleCount >= 30)
            totalPrice *= 0.85;

        else if (typeOfGroup.equals("Business") && peopleCount >= 100)
            totalPrice -= 10 * price;

        else if (typeOfGroup.equals("Regular") && (peopleCount >= 10 && peopleCount <= 20))
            totalPrice *= 0.95;

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
