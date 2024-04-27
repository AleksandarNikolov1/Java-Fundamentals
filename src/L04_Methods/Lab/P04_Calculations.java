package L04_Methods.Lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String method = sc.nextLine();
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        int result = 0;

        switch (method) {
            case "add":
                result = add(firstNum, secondNum);
                break;
            case "multiply":
                result = multiply(firstNum, secondNum);
                break;
            case "subtract":
                result = subtract(firstNum, secondNum);
                break;
            case "divide":
                result = divide(firstNum, secondNum);
                break;
        }

        System.out.println(result);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }
}
