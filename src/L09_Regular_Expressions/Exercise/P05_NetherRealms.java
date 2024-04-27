package L09_Regular_Expressions.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_NetherRealms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> demonNames = Arrays.stream(sc.nextLine().split(",")).collect(Collectors.toList());
        List<Demon> demons = new ArrayList<>();

        for (String name : demonNames) {

            name = name.replaceAll(" ", "");

            int health = 0;
            double damage = 0.0;

            int multipliers = 0;
            int divisors = 0;

            for (int i = 0; i < name.length(); i++) {
                if (Character.isLetter(name.charAt(i)))
                    health += name.charAt(i);

                else if (name.charAt(i) == '*')
                    multipliers++;

                else if (name.charAt(i) == '/')
                    divisors++;
            }

            try {
                String[] parts = name.split("[^0-9\\-+.]");
                for (String part : parts) {
                    if (!part.isEmpty()) {
                        damage += Double.parseDouble(part);
                    }
                }
            }
            catch (Exception ignored){

            }

            if (multipliers != 0)
                damage = damage * Math.pow(multipliers, 2);

            if (divisors != 0)
                damage = damage / Math.pow(divisors, 2);

            Demon demon = new Demon(name, health, damage);
            demons.add(demon);

        }

      //  demons.stream().sorted((f, s) -> f.getName().compareTo(s.getName()))
               demons.forEach(d -> System.out.printf("%s - %d health, %.2f damage%n", d.getName(), d.getHealth(), d.getDamage()));
    }

    public static class Demon{
        private String name;
        private int health;
        private double damage;

        public Demon(String name, int health, double damage) {
            this.name = name;
            this.health = health;
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public double getDamage() {
            return damage;
        }
    }
}


