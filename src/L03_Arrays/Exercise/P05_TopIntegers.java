package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {

            int currentNumber = numbers[i];
            boolean isTopInteger = true;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNumber <= numbers[j]) {
                    isTopInteger = false;
                    break;
                }
            }

            if (isTopInteger)
                System.out.print(currentNumber + " ");
        }
    }
}
