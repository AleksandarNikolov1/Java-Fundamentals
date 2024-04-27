package L08_Text_Processing.Exercise;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            char encryptedSymbol = (char) (currentSymbol + 3);
            encryptedText = encryptedText.concat(String.valueOf(encryptedSymbol));
        }

        System.out.println(encryptedText);
    }
}
