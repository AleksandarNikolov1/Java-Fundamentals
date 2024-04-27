package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rightSum = Arrays.stream(numbers).sum();
        int leftSum = 0;

        boolean areEqual = false;

        for (int i = 0; i < numbers.length; i++) {
            leftSum += numbers[i];

            if (leftSum == rightSum){
                System.out.println(i);
                areEqual = true;
                break;
            }

            rightSum -= numbers[i];
        }

        if (!areEqual)
            System.out.println("no");

    }
}
