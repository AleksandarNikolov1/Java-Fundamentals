package L03_Arrays.Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstArr = sc.nextLine().split("\\s+");
        String[] secondArr = sc.nextLine().split("\\s+");

        for (String s : firstArr) {
            for (String value : secondArr) {
                if (s.equals(value))
                    System.out.print(s + " ");
            }
        }
    }
}
