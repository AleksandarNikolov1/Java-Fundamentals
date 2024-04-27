package L01_Basic_Syntax_Conditional_Statements_and_Loops.More_Exercise;

import java.util.Scanner;

public class P03_GamingStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = Double.parseDouble(sc.nextLine());

        String game = sc.nextLine();
        double spentMoney = 0.0;


        while (!game.equals("Game Time")){

            double price = 0;

            switch (game){
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    price = 39.99;
                break;
                case "CS: OG": price = 15.99;
                    break;
                case "Zplinter Zell": price = 19.99;
                    break;
                case "Honored 2": price = 59.99;
                    break;
                case "RoverWatch": price = 29.99;
                    break;
                default:
                    System.out.println("Not found");
            }

            if (balance > price) {
                balance -= price;
                System.out.println("Bought " + game);
                spentMoney += price;
            }
            else if (price > balance)
                System.out.println("Too Expensive");
            else
                System.out.println("Out of money!");



            game = sc.nextLine();
        }

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, balance);

    }
}
