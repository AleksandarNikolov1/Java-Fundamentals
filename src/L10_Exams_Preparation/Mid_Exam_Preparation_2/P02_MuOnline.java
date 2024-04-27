package L10_Exams_Preparation.Mid_Exam_Preparation_2;

import java.util.Scanner;

public class P02_MuOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = sc.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {

            if (amDead(health))
                break;

            String[] room = rooms[i].split("\\s+");
            String command = room[0];
            int num = Integer.parseInt(room[1]);

            switch (command){
                case "potion":
                    num = additionalHealth(health, num);
                    health = increaseHealth(health, num);

                    System.out.printf("You healed for %d hp.%n", num);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins = increaseBitcoins(bitcoins, num);
                    System.out.printf("You found %d bitcoins.%n", num);
                    break;
                default:

                    health = monsterAttack(health, num);

                    if (amDead(health)) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i + 1);
                        break;
                    }

                    else
                        System.out.printf("You slayed %s.%n", command);

                    break;
            }

        }

        if (!amDead(health))
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);


    }



    private static int increaseHealth(int health, int additionalHealth){
        return health + additionalHealth;
    }

    private static int additionalHealth(int health, int additionalHealth){
        if (health + additionalHealth > 100){
            additionalHealth = 100 - health;
        }

        return additionalHealth;
    }

    private static int increaseBitcoins(int bitcoins, int additionalBitcoins){
        return bitcoins + additionalBitcoins;
    }

    private static int monsterAttack (int health, int monsterPower){
        return health - monsterPower;
    }

    private static boolean amDead(int health){
        return health <= 0;
    }
}

//    You have initial health 100 and initial bitcoins 0. You will be given a string representing the dungeon's rooms. Each room is separated with '|' (vertical bar): "room1|room2|room3…"
//        Each room contains a command and a number, separated by space. The command can be:
//        • "potion"
//        ◦ You are healed with the number in the second part. But your health cannot exceed your initial health (100).
//        ◦ First print: "You healed for {amount} hp."
//        ◦ After that, print your current health: "Current health: {health} hp."
//        • "chest"
//        ◦ You've found some bitcoins, the number in the second part.
//        ◦ Print: "You found {amount} bitcoins."
//        • In any other case, you are facing a monster, which you will fight. The second part of the room contains the attack of the monster. You should remove the monster's attack from your health.
//        ◦ If you are not dead (health <= 0), you've slain the monster, and you should print: "You slayed {monster}."
//        ◦ If you've died, print "You died! Killed by {monster}." and your quest is over. Print the best room you've managed to reach: "Best room: {room}"
//        If you managed to go through all the rooms in the dungeon, print on the following three lines:
//        "You've made it!
//        Bitcoins: {bitcoins}
//        Health: {health}"
//        Input / Constraints
//        You receive a string representing the dungeon's rooms, separated with '|' (vertical bar): "room1|room2|room3…".
//        Output
//        Print the corresponding messages described above.
//
//        rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000
//
//        You slayed rat.
//        You slayed bat.
//        You healed for 10 hp.
//        Current health: 80 hp.
//        You slayed rat.
//        You found 100 bitcoins.
//        You died! Killed by boss.
//        Best room: 6

