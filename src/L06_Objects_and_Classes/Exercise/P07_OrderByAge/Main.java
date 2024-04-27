package L06_Objects_and_Classes.Exercise.P07_OrderByAge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Person> people = new ArrayList<>();

        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");

            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Person person = new Person(name, id, age);
            people.add(person);

            input = sc.nextLine();
        }

        people.stream().sorted((p1, p2) -> Double.compare(p1.getAge(), p2.getAge()))
                .forEach(p -> System.out.print(p.toString()));

    }
}
