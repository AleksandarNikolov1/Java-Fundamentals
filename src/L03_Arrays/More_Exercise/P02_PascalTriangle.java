package L03_Arrays.More_Exercise;

import java.util.Scanner;

public class P02_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            int[] arr = new int[i];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j] + arr[j + 1];
            }

            arr[0] = 1;
            arr[arr.length - 1] = 1;

            for (int el : arr) {
                System.out.print(el + " ");
            }

            System.out.println();
        }


    }
}
