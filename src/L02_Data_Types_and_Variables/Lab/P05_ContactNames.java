package L02_Data_Types_and_Variables.Lab;

import java.util.Scanner;

public class P05_ContactNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String delimiter = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        sb.append(firstName);
        sb.append(delimiter);
        sb.append(secondName);

        String output = sb.toString();

        System.out.println(output);
    }
}
