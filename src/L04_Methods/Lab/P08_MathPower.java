package L04_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());

        double result = pow(num, power);

        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double pow (double num, int power){
        return Math.pow(num, power);
    }
}
