package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] userData = sc.nextLine().split("\\s+");

            String command = userData[0];
            String username = userData[1];

            if (command.equals("register")) {
                String licensePlateNumber = userData[2];

                if (!parking.containsKey(username)) {
                    parking.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                }

                else
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
            }

            else if (command.equals("unregister")) {

                if (parking.containsKey(username)){
                    parking.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }

                else
                System.out.printf("ERROR: user %s not found%n", username);
            }
        }

        parking.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
