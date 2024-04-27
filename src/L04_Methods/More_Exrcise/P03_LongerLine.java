package L04_Methods.More_Exrcise;

import java.util.Scanner;

public class P03_LongerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 2;

        double bestLineDistance = 0;

        int X1 = 0;
        int Y1 = 0;
        int X2 = 0;
        int Y2 = 0;

        while (n-- > 0) {
            int x1 = Integer.parseInt(sc.nextLine());
            int y1 = Integer.parseInt(sc.nextLine());
            int x2 = Integer.parseInt(sc.nextLine());
            int y2 = Integer.parseInt(sc.nextLine());

            double lineDistance = getDistance(x1, y1, x2, y2);

            if (bestLineDistance < lineDistance) {
                bestLineDistance = lineDistance;

                X1 = x1;
                Y1 = y1;
                X2 = x2;
                Y2 = y2;
            }
        }

        double distance1 = getDistance(X1, Y1, 0, 0);
        double distance2 = getDistance(X2, Y2, 0, 0);

        if (distance1 <= distance2) {
            System.out.printf("(%d, %d)(%d, %d)%n", X1, Y1, X2, Y2);
        } else
            System.out.printf("(%d, %d)(%d, %d)%n", X2, Y2, X1, Y1);


    }


    private static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
