package L09_Regular_Expressions.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+(?:\\.\\d+)?)!(?<quantity>\\d+)";

        String input = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Map<String, Double> furnitureMap = new LinkedHashMap<>();

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureMap.put(furniture, price * quantity);
            }

            input = sc.nextLine();
        }

        double totalPrice = 0.0;

        for (Double value : furnitureMap.values()) {
            totalPrice += value;
        }

        System.out.println("Bought furniture:");
        furnitureMap.forEach((key, value) -> System.out.println(key));
        System.out.printf("Total money spend: %.2f%n", totalPrice);

    }
}
