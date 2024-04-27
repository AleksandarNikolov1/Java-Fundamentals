package L08_Text_Processing.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = sc.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();

        for (String username : usernames) {

            if (isValidUsername(username))
                validUsernames.add(username);
        }

        for (String validUsername : validUsernames) {
            System.out.println(validUsername);
        }
    }

    private static boolean isValidUsername(String username) {

        if (username.length() < 3 || username.length() > 16 )
            return false;

        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_') {
                return false;
            }
        }
        return true;
    }
}