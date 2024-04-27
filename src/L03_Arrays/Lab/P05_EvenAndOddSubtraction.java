package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddSum = 0;
        int evenSum = 0;

        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int currentNum : numbers) {

            if (currentNum % 2 == 1)
                oddSum += currentNum;

            else
                evenSum += currentNum;
        }

        int diff = evenSum - oddSum;

        System.out.println(diff);
    }
}
