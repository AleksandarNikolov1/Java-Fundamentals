package L11_Final_Exam.P03_Heroes;

import java.util.*;

public class Hero {
    private String name;
    private int hp;
    private int mp;

    public Hero(String name, int hp, int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Hero> heroes = new LinkedHashMap<>();


        while (n-- > 0) {
            String[] tokens = sc.nextLine().split(" ");
            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            Hero hero = new Hero(heroName, hp, mp);

            heroes.put(heroName, hero);
        }

        String input = sc.nextLine();

        while (!input.equals("End")) {

            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String heroName = tokens[1];

            Hero hero = heroes.get(heroName);

            if (command.equals("CastSpell")) {
                int mpNeeded = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];


                if (hero.getMp() >= mpNeeded) {
                    hero.setMp(hero.getMp() - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now " +
                            "has %d MP!%n", heroName, spellName, hero.getMp());
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                }

            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];

                hero.setHp(hero.getHp() - damage);

                if (hero.getHp() <= 0) {
                    heroes.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                } else {
                    System.out.printf("%s was hit for %d HP by %s " +
                            "and now has %d HP left!%n", heroName, damage, attacker, hero.getHp());
                }
            } else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(tokens[2]);

                if (hero.getMp() + amount > 200){
                    amount = 200 - hero.getMp();
                    hero.setMp(200);
                }

                else {
                    hero.setMp(hero.getMp() + amount);
                }

                System.out.printf("%s recharged for %d MP!%n", heroName, amount);

            } else if (command.equals("Heal")){
                int amount = Integer.parseInt(tokens[2]);

                if (hero.getHp() + amount > 100){
                    amount = 100 - hero.getHp();
                    hero.setHp(100);
                }

                else {
                    hero.setHp(hero.getHp() + amount);
                }

                System.out.printf("%s healed for %d HP!%n", heroName, amount);
            }


            input = sc.nextLine();
        }

        for (var entry : heroes.entrySet()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(), entry.getValue().getHp(), entry.getValue().getMp());
        }
    }
}
