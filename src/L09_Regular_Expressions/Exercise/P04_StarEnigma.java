package L09_Regular_Expressions.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_StarEnigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String regex = ".*?@(?<planet>[A-Z][a-z]+)[^@\\-:!>]*:(?<population>[0-9]+)[^@\\-:!>]*!(?<attackType>[AD])![^@\\-:!>]*->(?<soldiersCount>[0-9]+)[^@\\-:!>]*";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        while (n-- > 0){
            String input = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            int counter = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 's' || input.charAt(i) == 't' || input.charAt(i) == 'a' || input.charAt(i) == 'r'
                || input.charAt(i) == 'S' || input.charAt(i) == 'T' || input.charAt(i) == 'A' || input.charAt(i) == 'R')
                    counter++;
            }

            for (int i = 0; i < input.length(); i++) {
                sb.append((char) (input.charAt(i) - counter));
            }

            Matcher matcher = pattern.matcher(sb.toString());

            if (matcher.find()){
                String planet = matcher.group("planet");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldiersCount = Integer.parseInt(matcher.group("soldiersCount"));

                if (attackType.equals("A")){
                    attackedPlanets.add(planet);
                }

                else
                    destroyedPlanets.add(planet);
            }
        }

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        if (!attackedPlanets.isEmpty()){
            Collections.sort(attackedPlanets);
            for (String attackedPlanet : attackedPlanets) {
                System.out.printf("-> %s%n", attackedPlanet);
            }
        }

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        if (!destroyedPlanets.isEmpty()){
            Collections.sort(destroyedPlanets);
            for (String destroyedPlanet : destroyedPlanets) {
                System.out.printf("-> %s%n", destroyedPlanet);
            }
        }
    }
}
