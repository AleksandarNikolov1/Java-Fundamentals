package L03_Arrays.Exercise;

import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 0; i < n; i++) {

            int firstEl = sc.nextInt();
            int secondEl = sc.nextInt();

            if (i % 2 == 0) {
                firstArr[i] = firstEl;
                secondArr[i] = secondEl;
            } else {
                firstArr[i] = secondEl;
                secondArr[i] = firstEl;
            }
        }

            for (int el : firstArr) {
                System.out.print(el + " ");
            }

            System.out.println();

            for (int el : secondArr) {
                System.out.print(el + " ");
            }
        }
    }

