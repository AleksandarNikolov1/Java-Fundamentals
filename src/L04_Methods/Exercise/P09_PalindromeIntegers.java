package L04_Methods.Exercise;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("END")) {

            int num = Integer.parseInt(input);

            System.out.println(checkIfItsPalindromeInt(num));

            input = sc.nextLine();
        }


    }

    private static boolean checkIfItsPalindromeInt(int num) {

        StringBuilder sb = new StringBuilder();

        for (int i = String.valueOf(num).length() - 1; i >= 0; i--) {
            sb.append(String.valueOf(num).charAt(i));
        }

        int reversedNum = Integer.parseInt(sb.toString());

        if (num == reversedNum)
            return true;

        else
            return false;
    }
}
