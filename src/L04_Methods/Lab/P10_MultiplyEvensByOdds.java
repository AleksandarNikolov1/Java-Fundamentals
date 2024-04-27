package L04_Methods.Lab;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        int result = getMultipleOfEvensAndOdds(input);

        System.out.println(result);
    }

    private static int getMultipleOfEvensAndOdds (int num){
        String numAsString = String.valueOf(num);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numAsString.length(); i++) {

            if (numAsString.charAt(i) == '-')
                continue;

            int digit = Integer.parseInt(String.valueOf(numAsString.charAt(i)));

            if (digit % 2 == 0)
                evenSum += digit;

            else
                oddSum += digit;
        }

        return evenSum * oddSum;
    }
}
