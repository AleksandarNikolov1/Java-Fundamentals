package L04_Methods.Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char start = sc.nextLine().charAt(0);
        char end = sc.nextLine().charAt(0);

        getCharsBetweenTwoChars(start, end);
    }

    public static void getCharsBetweenTwoChars (char start, char end){
        int min = Math.min((int) start, (int) end);
        int max = Math.max((int) start, (int) end);

        for (int i = min + 1; i < max; i++) {
            System.out.print((char) i + " ");
        }
    }
}
