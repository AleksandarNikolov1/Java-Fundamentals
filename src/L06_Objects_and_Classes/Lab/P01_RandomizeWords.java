package L06_Objects_and_Classes.Lab;

import java.util.Random;
import java.util.Scanner;

public class P01_RandomizeWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");
        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {
            int j = rnd.nextInt(words.length);
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        System.out.println(String.join(System.lineSeparator(), words));
    }
}
