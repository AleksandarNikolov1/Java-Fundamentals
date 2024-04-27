package L04_Methods.More_Exrcise;

import java.util.Scanner;

public class P05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println(signMultiplication(arr));

    }

    private static String signMultiplication(int[] arr){

        int negativeNumCounter = 0;

        for (int num : arr) {

            if (num == 0)
                return "zero";

            else if (num < 0)
                negativeNumCounter++;

        }

        if (negativeNumCounter % 2 == 1)
            return "negative";

        else
            return "positive";
    }
}
