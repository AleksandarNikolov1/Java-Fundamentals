package L04_Methods.Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        double result = divideTwoFactorials(a, b);

        System.out.printf("%.2f", result);
    }

    private static double divideTwoFactorials (int a, int b){

        return (double) fact(a) / (double) fact(b);

    }

    private static long fact (int a){

        long fact = 1;

        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
