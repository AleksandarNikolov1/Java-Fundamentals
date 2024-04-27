package L08_Text_Processing.Lab;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (String bannedWord : bannedWords) {
            if (text.contains(bannedWord)) {
                String replacement = "";
                for (int i = 0; i < bannedWord.length(); i++) {
                    replacement = replacement.concat("*");
                }

                text = text.replace(bannedWord, replacement);
            }
        }

        System.out.println(text);
    }
}
