package L04_Methods.Lab;

import java.util.Scanner;

public class P06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());

        int area = rectangleArea(width, length);

        System.out.println(area);
    }

    private static int rectangleArea (int a, int b){
        return a * b;
    }
}
