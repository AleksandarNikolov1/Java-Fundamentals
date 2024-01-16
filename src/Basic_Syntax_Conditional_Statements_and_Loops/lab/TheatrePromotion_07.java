package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        int price = 0;

        boolean ageIsValid = true;

        if (age >= 0 && age <= 122) {
            switch (typeOfDay) {
                case "Weekday":
                    if (age <= 18)
                        price = 12;

                    else if (age <= 64)
                        price = 18;

                    else
                        price = 12;

                        break;

                case "Weekend":
                    if (age <= 18)
                        price = 15;

                    else if (age <= 64)
                        price = 20;

                    else
                        price = 15;

                    break;

                case "Holiday":
                    if (age <= 18)
                        price = 5;

                    else if (age <= 64)
                        price = 12;

                    else
                        price = 10;

                    break;
            }
        }

        else {
            ageIsValid = false;
            System.out.println("Error!");
        }

        if (ageIsValid)
            System.out.println(price + "$");

    }
}