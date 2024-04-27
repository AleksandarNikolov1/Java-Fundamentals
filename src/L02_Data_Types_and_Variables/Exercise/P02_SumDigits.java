package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String numAsString = String.valueOf(num);

        int sum = 0;

        for (int i = 0; i < numAsString.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(numAsString.charAt(i)));
            sum += digit;
        }

        System.out.println(sum);
    }
}
