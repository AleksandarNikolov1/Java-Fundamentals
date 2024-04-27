package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startFromChar = Integer.parseInt(sc.nextLine());
        int endToChar = Integer.parseInt(sc.nextLine());

        for (int i = startFromChar; i <= endToChar; i++) {
            char c = (char) i;
            System.out.print(c + " ");
        }
    }
}
