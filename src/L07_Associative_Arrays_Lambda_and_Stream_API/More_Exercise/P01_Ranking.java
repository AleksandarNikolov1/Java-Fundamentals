package L07_Associative_Arrays_Lambda_and_Stream_API.More_Exercise;

import java.util.*;

public class P01_Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, String> passwords = new HashMap<>();

        while (!input.equals("end of contests")){

            String contest = input.split(":")[0];
            String password = input.split(":")[1];

            passwords.put(contest, password);

            input = sc.nextLine();
        }

        input = sc.nextLine();

        Map<String, Map<String, Integer>> contests = new TreeMap<>();

        while (!input.equals("end of submissions")){
            String[] tokens = input.split("=>");
            String contest = tokens[0];
            String password = tokens[1];
            String username = tokens[2];
            int points = Integer.parseInt(tokens[3]);

            if (isValidContest(passwords, contest, password)){
                contests.putIfAbsent(username, new HashMap<>());
                contests.get(username).putIfAbsent(contest, points);

                if (points > contests.get(username).get(contest))
                    contests.get(username).put(contest, points);
            }


            input = sc.nextLine();
        }

        String winner = "";
        int bestPoints = 0;

        for (Map.Entry<String, Map<String, Integer>> entry : contests.entrySet()) {

            int totalPoints = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();
            if (totalPoints > bestPoints) {
                winner = entry.getKey();
                bestPoints = totalPoints;
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", winner, bestPoints);


        System.out.println("Ranking: ");
        contests.forEach((key, value) -> {
            System.out.println(key);
            value.entrySet().stream().sorted((f, s) -> s.getValue().compareTo(f.getValue()))
                    .forEach(c -> System.out.printf("#  %s -> %d%n", c.getKey(), c.getValue()));
        });

    }

    private static boolean isValidContest (Map<String, String> map, String contest, String password){
        return map.containsKey(contest) && map.get(contest).equals(password);
    }
}
