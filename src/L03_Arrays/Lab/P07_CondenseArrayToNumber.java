package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayOfInts = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        if (arrayOfInts.length == 1)
            System.out.println(arrayOfInts[0]);

        else {

            while (arrayOfInts.length != 2) {

                int[] condensedArray = new int[arrayOfInts.length - 1];

                for (int i = 0; i < arrayOfInts.length - 1; i++) {

                    int currentNum = arrayOfInts[i];
                    int nextNum = arrayOfInts[i + 1];

                    int sum = currentNum + nextNum;

                    condensedArray[i] = sum;
                }

                arrayOfInts = condensedArray;
            }

            int sum = Arrays.stream(arrayOfInts).sum();

            System.out.println(sum);
        }
    }
}
