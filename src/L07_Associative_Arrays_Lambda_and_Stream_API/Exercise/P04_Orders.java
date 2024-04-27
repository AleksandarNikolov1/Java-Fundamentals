package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Double> priceList = new LinkedHashMap<>();
        Map<String, Integer> quantityList = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] productData = input.split("\\s+");
            String product = productData[0];
            double price = Double.parseDouble(productData[1]);
            int quantity = Integer.parseInt(productData[2]);

            priceList.put(product, price);

            quantityList.putIfAbsent(product, 0);
            quantityList.put(product, quantityList.get(product) + quantity);

            input = sc.nextLine();
        }

        Map<String, Double> totalPriceList = new LinkedHashMap<>();

        for (var e : priceList.entrySet()){
            double totalPrice = e.getValue() * quantityList.get(e.getKey());
            totalPriceList.put(e.getKey(), totalPrice);
        }

        for (var e : totalPriceList.entrySet()) {
            System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue());
        }

    }
}
