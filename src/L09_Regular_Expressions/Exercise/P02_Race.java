package L09_Regular_Expressions.Exercise;

import java.util.*;

public class P02_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> participants = Arrays.stream(sc.nextLine().split(", ")).toList();

        String input = sc.nextLine();

        Map<String, Integer> racersResults = new LinkedHashMap<>();

        while (!input.equals("end of race")){

            StringBuilder name = new StringBuilder();
            int distance = 0;

            for (int i = 0; i < input.length(); i++) {
                if (Character.isLetter(input.charAt(i)))
                    name.append(input.charAt(i));

                if (Character.isDigit(input.charAt(i)))
                    distance += Integer.parseInt(input.charAt(i) + "");
            }


            if (participants.contains(name.toString())) {
                racersResults.putIfAbsent(name.toString(), 0);
                racersResults.put(name.toString(), racersResults.get(name.toString()) + distance);
            }

            input = sc.nextLine();
        }

        List<String> winners = new ArrayList<>();

        racersResults.entrySet().stream().sorted((f, s) -> s.getValue().compareTo(f.getValue())).limit(3)
                .forEach(r -> winners.add(r.getKey()));

        System.out.printf("1st place: %s%n", winners.get(0));
        System.out.printf("2nd place: %s%n", winners.get(1));
        System.out.printf("3rd place: %s%n", winners.get(2));
    }
}