package Data_Types_and_Variables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        BigDecimal sum = new BigDecimal(0);
        while (n -- > 0){

            BigDecimal num = new BigDecimal(sc.nextLine());

            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
