package L05_Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> guestList = new ArrayList<>();

        while (n-- > 0){
            String input = sc.nextLine();
            String[] tokens = input.split("\\s+", 2);

            String guestName = tokens[0];
            String command = tokens[1];

            if (command.equals("is going!")){
                if (guestList.contains(guestName))
                    System.out.printf("%s is already in the list!%n", guestName);

                else
                    guestList.add(guestName);
            }

            else if (command.equals("is not going!")){
                if (guestList.contains(guestName))
                    guestList.remove(guestName);

                else
                    System.out.printf("%s is not in the list!%n", guestName);
            }
        }

        for (String guestName : guestList) {
            System.out.println(guestName);
        }
    }
}
