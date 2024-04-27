package L02_Data_Types_and_Variables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal pounds = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));

        BigDecimal usd = pounds.multiply(BigDecimal.valueOf(1.31));

        System.out.printf("%.3f", usd);
    }
}
