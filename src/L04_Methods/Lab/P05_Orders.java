package L04_Methods.Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());

        printTotalPrice(product, count);

    }

    private static void printTotalPrice (String product, int count){
        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;

        double totalPrice = 0.0;

        switch (product){
            case "coffee": totalPrice = coffeePrice * count;
                break;
            case "water": totalPrice = waterPrice * count;
                break;
            case "coke": totalPrice = cokePrice * count;
                break;
            case "snacks": totalPrice = snacksPrice * count;
                break;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
