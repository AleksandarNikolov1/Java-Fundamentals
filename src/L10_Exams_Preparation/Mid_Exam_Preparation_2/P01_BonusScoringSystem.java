package L10_Exams_Preparation.Mid_Exam_Preparation_2;

import java.util.Scanner;

public class P01_BonusScoringSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsCount = Integer.parseInt(sc.nextLine());
        int lecturesCount = Integer.parseInt(sc.nextLine());
        int additionalBonus = Integer.parseInt(sc.nextLine());

        double maxBonus = 0;
        int attendedLectures = 0;

        while (studentsCount-- > 0){
            int attendancesCount = Integer.parseInt(sc.nextLine());

            double totalBonus = (double) attendancesCount / lecturesCount * (5 + additionalBonus);

            if (totalBonus > maxBonus) {
                maxBonus = (int) Math.ceil(totalBonus);
                attendedLectures = attendancesCount;
            }
        }

        System.out.printf("Max Bonus: %.0f.%nThe student has attended %d lectures.", maxBonus, attendedLectures);
    }

}
