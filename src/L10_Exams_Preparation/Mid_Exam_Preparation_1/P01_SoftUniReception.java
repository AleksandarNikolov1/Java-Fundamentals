package L10_Exams_Preparation.Mid_Exam_Preparation_1;

import java.util.Scanner;

public class P01_SoftUniReception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentsPerHour1 = Integer.parseInt(sc.nextLine());
        int studentsPerHour2 = Integer.parseInt(sc.nextLine());
        int studentsPerHour3 = Integer.parseInt(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());

        int totalStudentsPerHour = studentsPerHour1 + studentsPerHour2 + studentsPerHour3;
        int hours = 0;
        while (students > 0) {

            hours++;

            if (hours % 4 != 0){
                students -= totalStudentsPerHour;
            }

        }

        System.out.printf("Time needed: %dh.", hours);

    }
}
