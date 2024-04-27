package L04_Methods.Lab;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        printTriangle(n);
    }

    private static void printTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            if (i == n) {
                for (int k = n; k > 0; k--) {
                    for (int j = 1; j < k; j++) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
