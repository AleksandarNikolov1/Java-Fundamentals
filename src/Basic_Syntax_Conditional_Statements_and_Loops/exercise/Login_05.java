package Basic_Syntax_Conditional_Statements_and_Loops.exercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(username);

        String password = sb.reverse().toString();

        int count = 0;
        boolean isBlocked = false;

        String passInput = sc.nextLine();

        while (!passInput.equals(password)) {

            count ++;

            if (count == 4) {
                System.out.println("User " + username + " blocked!");
                isBlocked = true;
                break;
            }

            System.out.println("Incorrect password. Try again.");
            passInput = sc.nextLine();
        }

        if (!isBlocked)
            System.out.println("User " + username + " logged in.");
    }
}
