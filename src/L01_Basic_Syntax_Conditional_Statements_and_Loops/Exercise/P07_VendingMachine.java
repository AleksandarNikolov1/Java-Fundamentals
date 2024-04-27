package L01_Basic_Syntax_Conditional_Statements_and_Loops.Exercise;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double sumOfMoney = 0;

        while (!input.equals("Start")){


            double money = Double.parseDouble(input);

            if (money != 0.1 && money != 0.2 && money != 0.5 && money != 1 && money != 2)
                System.out.printf("Cannot accept %.2f%n", money);

            else
                sumOfMoney += money;

            input = sc.nextLine();

            if (input.equals("Start")){

                String product = sc.nextLine();

                while (!product.equals("End")){

                    double price = 0;
                    boolean validProduct = true;

                    switch (product){
                        case "Nuts":
                            price = 2.0;
                            break;
                        case "Water":
                            price = 0.7;
                            break;
                        case "Crisps":
                            price = 1.5;
                            break;
                        case "Soda":
                            price = 0.8;
                            break;
                        case "Coke":
                            price = 1.0;
                            break;
                        default:
                            validProduct = false;
                            System.out.println("Invalid product");
                    }

                    if (validProduct) {
                        if (sumOfMoney - price >= 0) {
                            System.out.println("Purchased " + product);
                            sumOfMoney -= price;
                        } else
                            System.out.println("Sorry, not enough money");
                    }

                    product = sc.nextLine();
                }
            }
        }

        if (sumOfMoney >= 0)
            System.out.printf("Change: %.2f", sumOfMoney);

    }
}
