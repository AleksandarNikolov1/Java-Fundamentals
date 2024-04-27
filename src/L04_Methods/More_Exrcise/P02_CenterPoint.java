package L04_Methods.More_Exrcise;

import java.util.Scanner;

public class P02_CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = Integer.parseInt(sc.nextLine());
        int y1 = Integer.parseInt(sc.nextLine());
        int x2 = Integer.parseInt(sc.nextLine());
        int y2 = Integer.parseInt(sc.nextLine());

        double distance1 = getDistance(x1, y1, 0, 0);
        double distance2 = getDistance(x2, y2, 0, 0);

        if (distance1 <= distance2){
            System.out.printf("(%d, %d)", x1, y1);
        }

        else
            System.out.printf("(%d, %d)", x2, y2);
    }

    private static double getDistance(int x1, int y1, int x2, int y2){
       return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
