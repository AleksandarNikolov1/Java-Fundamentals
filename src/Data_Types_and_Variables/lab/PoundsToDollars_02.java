package Data_Types_and_Variables.lab;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class PoundsToDollars_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal pounds = BigDecimal.valueOf(Double.parseDouble(sc.nextLine()));

        BigDecimal usd = pounds.multiply(BigDecimal.valueOf(1.31));

        System.out.printf("%.3f", usd);
    }
}
