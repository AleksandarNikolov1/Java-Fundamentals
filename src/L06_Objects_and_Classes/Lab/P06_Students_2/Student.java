package L06_Objects_and_Classes.Lab.P06_Students_2;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    private static boolean isStudentAlreadyExist(List<Student> students, String firstName, String lastName){

        boolean exist = false;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                exist = true;
                break;
            }
        }

        return exist;
    }


    private static Student getStudent(List<Student> students, String firstName, String lastName){
        return students.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName))
                .findFirst().orElse(null);
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

            if (isStudentAlreadyExist(students, firstName, lastName)){
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            }

            else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }

            input = sc.nextLine();
        }

        String city = sc.nextLine();

        students.stream().filter(s -> s.getHomeTown().equals(city)).
                forEach(s -> System.out.printf("%s %s is %d years old%n", s.getFirstName(), s.getLastName(), s.getAge()));

    }
}
