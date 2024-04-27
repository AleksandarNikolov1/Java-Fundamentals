package L02_Data_Types_and_Variables.More_Exercise;

import java.util.Scanner;

public class P05_DecryptingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0){
            char c = sc.nextLine().charAt(0);
            c += key;

            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
