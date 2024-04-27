package L06_Objects_and_Classes.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());

        BigInteger sum = firstNum.add(secondNum);

        System.out.println(sum);
    }
}
