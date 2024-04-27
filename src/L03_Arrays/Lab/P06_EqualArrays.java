package L03_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int [] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean areEqual = true;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    areEqual = false;
                    break;
                }

                else {
                    sum += arr1[i];
                }
            }
        }

        else {
            areEqual = false;
        }

        if (areEqual)
            System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
