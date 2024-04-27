package L04_Methods.Exercise;

import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        printTopInts(n);
    }

    private static void printTopInts (int n){

        for (int i = 17; i <= n; i++) {
            int length = String.valueOf(i).length();
            int [] digits = new int[length];

            int sum = 0;
            boolean containsOddDigit = false;

            for (int j = 0; j < digits.length; j++) {
                digits[j] = Integer.parseInt(String.valueOf(String.valueOf(i).charAt(j)));

                if (digits[j] % 2 == 1)
                    containsOddDigit = true;

                sum += digits[j];
            }

            if (sum % 8 == 0 && containsOddDigit){
                System.out.println(i);
            }
        }
    }
}
