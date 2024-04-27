package L03_Arrays.Lab;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());

        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};

        if (day > 0 && day < 8)
            System.out.println(daysOfWeek[day - 1]);

        else
            System.out.println("Invalid day!");
    }
}
