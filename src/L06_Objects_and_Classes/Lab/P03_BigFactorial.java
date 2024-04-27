package L06_Objects_and_Classes.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_BigFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        BigInteger fact = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);
    }
}
