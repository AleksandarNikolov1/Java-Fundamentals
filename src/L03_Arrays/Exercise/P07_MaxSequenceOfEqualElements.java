package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int bestLength = 0;
        int currentLength = 1;
        int digit = 0;

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] == array[i + 1]){
                currentLength ++;
                if (currentLength > bestLength){
                    bestLength = currentLength;
                    digit = array[i];
                }
            }
            else {
                currentLength = 1;
            }
        }

        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
