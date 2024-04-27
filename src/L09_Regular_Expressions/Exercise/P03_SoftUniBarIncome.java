package L09_Regular_Expressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matcher matcher;

        String regex = "%(?<customerName>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w ]+)?[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.0-9+]*(?<price>[0-9]+(\\.[0-9]+)?)\\$";

        Pattern pattern = Pattern.compile(regex);

        double totalIncome = 0;

        while (true){
            String input = sc.nextLine();

            if (input.equals("end of shift"))
                break;

            matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("customerName");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                totalIncome += count * price;

                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
            }

        }

        System.out.printf("Total income: %.2f", totalIncome);
    }
}
