package L06_Objects_and_Classes.Exercise.P05_Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Student> students = new ArrayList<>();

        while(n-- > 0){

            String[] tokens = sc.nextLine().split("\\s+");

            String fName = tokens[0];
            String lName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student student = new Student();

            student.setFirstName(fName);
            student.setLastName(lName);
            student.setGrade(grade);

            students.add(student);
        }

        students.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(s -> System.out.println(s.toString()));

    }
}
