package L04_Methods.Exercise;

import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());

        System.out.println(getMin(a, b, c));

    }

    private static int getMin(int a, int b, int c){
        int minEl = Math.min(a, b);
        minEl = Math.min(minEl, c);

        return minEl;
    }
}
