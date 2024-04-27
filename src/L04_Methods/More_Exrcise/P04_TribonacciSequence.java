package L04_Methods.More_Exrcise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_TribonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        System.out.println(getTribonacciSequence(num));
    }

    private static String getTribonacciSequence(int n){
        int[] arr = new int[n];

        if (arr.length > 3) {
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;

            for (int i = 3; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }

        else if (n == 1)
            arr[0] = 1;

        else if (n == 2) {
            arr[0] = 1;
            arr[1] = 1;
        }
        else if (n == 3){
            arr[0] = 1;
            arr[1] = 1;
            arr[2] = 2;
        }

        return Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }
}
