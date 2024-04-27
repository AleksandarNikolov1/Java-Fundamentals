package L04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double firstDigit = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        double secondDigit = Integer.parseInt(sc.nextLine());

        double result = calculate(firstDigit, operator, secondDigit);

        System.out.println(new DecimalFormat("0.######").format(result));
    }

    private static double calculate(double a, char operator, double b){

        double result = 0.0;

        switch (operator){
            case '/': result = a / b;
            break;
            case '*': result = a * b;
            break;
            case '+': result = a + b;
            break;
            case '-': result = a - b;
            break;

        }
        return result;
    }
}
