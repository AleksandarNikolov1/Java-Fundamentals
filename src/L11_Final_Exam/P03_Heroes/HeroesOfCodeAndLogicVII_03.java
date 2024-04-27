package L11_Final_Exam.P03_Heroes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> hps = new LinkedHashMap<>();
        Map<String, Integer> mps = new LinkedHashMap<>();


        while (n-- > 0) {
            String[] tokens = sc.nextLine().split(" ");
            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            hps.put(heroName, hp);
            mps.put(heroName, mp);
        }

        String input = sc.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];


            if (command.equals("CastSpell")) {
                int mpNeeded = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];

                if (mps.get(heroName) >= mpNeeded) {
                    mps.put(heroName, mps.get(heroName) - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now " +
                            "has %d MP!%n", heroName, spellName, mps.get(heroName));
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }

            }

            else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];

                hps.put(heroName, hps.get(heroName) - damage);

                if (hps.get(heroName) <= 0) {
                    hps.remove(heroName);
                    mps.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                } else {
                    System.out.printf("%s was hit for %d HP by %s " +
                            "and now has %d HP left!%n", heroName, damage, attacker, hps.get(heroName));
                }
            }

            else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(tokens[2]);

                if (mps.get(heroName) + amount > 200){
                    amount = 200 - mps.get(heroName);
                    mps.put(heroName, 200);
                }

                else {
                    mps.put(heroName, mps.get(heroName) + amount);
                }

                System.out.printf("%s recharged for %d MP!%n", heroName, amount);

            }

            else if (command.equals("Heal")){
                int amount = Integer.parseInt(tokens[2]);

                if (hps.get(heroName) + amount > 100){
                    amount = 100 - hps.get(heroName);
                    hps.put(heroName, 100);
                }

                else {
                    hps.put(heroName, hps.get(heroName) + amount);
                }

                System.out.printf("%s healed for %d HP!%n", heroName, amount);
            }


            input = sc.nextLine();
        }

        for (var entry : hps.entrySet()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(), entry.getValue(), mps.get(entry.getKey()));
        }

    }
}
