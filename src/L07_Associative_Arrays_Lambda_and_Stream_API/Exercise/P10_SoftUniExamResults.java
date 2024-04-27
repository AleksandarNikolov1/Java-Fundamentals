package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P10_SoftUniExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Integer> pointsTable = new HashMap<>();
        Map<String, Integer> submissionsTable = new HashMap<>();

        while (!input.equals("exam finished")) {

            String[] tokens = input.split("-");


            String username = tokens[0];

            if (tokens.length == 3) {
                String language = tokens[1];
                int points = Integer.parseInt(tokens[2]);

                pointsTable.putIfAbsent(username, points);

                if (points > pointsTable.get(username))
                    pointsTable.put(username, points);


                submissionsTable.putIfAbsent(language, 0);
                submissionsTable.put(language, submissionsTable.get(language) + 1);
            } else if (tokens.length == 2) {
                if (tokens[1].equals("banned"))
                    pointsTable.remove(username);
            }

            input = sc.nextLine();
        }


        System.out.println("Results:");
        pointsTable.entrySet().stream().sorted((u1, u2) -> {
            int result = u2.getValue().compareTo(u1.getValue());

            if (result == 0)
                result = u1.getKey().compareTo(u2.getKey());

            return result;

        }).forEach(u -> System.out.printf("%s | %d%n", u.getKey(), u.getValue()));


        System.out.println("Submissions:");
        submissionsTable.entrySet().stream().sorted((s1, s2) -> {
            int result = s2.getValue().compareTo(s1.getValue());

            if (result == 0)
                result = s1.getKey().compareTo(s2.getKey());

            return result;

        }).forEach(s ->
            System.out.printf("%s - %d%n", s.getKey(), s.getValue()));
    }
}
