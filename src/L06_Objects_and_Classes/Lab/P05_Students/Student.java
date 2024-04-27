package L06_Objects_and_Classes.Lab.P05_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Student(String firstName, String lastName, int age, String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")){

            String[] studentData = input.split("\\s+");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];

            Student student = new Student(firstName, lastName, age, homeTown);

            students.add(student);

            input = sc.nextLine();
        }

        String city = sc.nextLine();

        students.stream().filter(s -> s.getHomeTown().equals(city)).
                forEach(s -> System.out.printf("%s %s is %d years old%n", s.getFirstName(), s.getLastName(), s.getAge()));

    }
}
