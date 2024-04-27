package L08_Text_Processing.Lab;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstString = sc.nextLine();
        String secondString = sc.nextLine();

        int index = secondString.indexOf(firstString);

        for (int i = index; i < secondString.length(); i++) {
           secondString = secondString.replace(firstString, "");
        }

        System.out.println(secondString);
    }
}
