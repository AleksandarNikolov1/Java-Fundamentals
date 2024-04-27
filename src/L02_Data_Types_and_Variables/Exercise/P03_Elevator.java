package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int peopleCount = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        int courses = 1;

        if (peopleCount > capacity) {
             courses = peopleCount / capacity;

            if (peopleCount > courses * capacity)
                courses += 1;
        }

        System.out.println(courses);
    }
}
