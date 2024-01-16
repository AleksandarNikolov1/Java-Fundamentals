package Data_Types_and_Variables.lab;

import java.util.Scanner;

public class ContactNames_05 {
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
