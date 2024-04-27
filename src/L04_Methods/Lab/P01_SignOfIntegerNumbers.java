package L04_Methods.Lab;

import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        printSignOfInts(number);

    }

    private static void printSignOfInts (int num){
        if (num > 0)
            System.out.printf("The number %d is positive.", num);
        else if (num < 0)
            System.out.printf("The number %d is negative.", num);
        else
            System.out.printf("The number %d is zero.", 0);
    }
}
