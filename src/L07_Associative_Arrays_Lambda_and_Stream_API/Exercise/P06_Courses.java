package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.*;

public class P06_Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            courses.putIfAbsent(course, new ArrayList<>());
            courses.get(course).add(student);

            input = sc.nextLine();
        }

        courses.entrySet().stream().sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(c -> {
                    System.out.printf("%s: %d%n", c.getKey(), c.getValue().size());
                    c.getValue().stream().sorted(String::compareTo)
                            .forEach(s -> System.out.printf("-- %s%n", s));

                });
    }
}
