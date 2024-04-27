package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<Character, Integer> charsCounter = new LinkedHashMap<>();

        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (c != ' ') {
                charsCounter.putIfAbsent(c, 0);
                charsCounter.put(c, charsCounter.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : charsCounter.entrySet()) {
            System.out.printf("%c -> %d%n", e.getKey(), e.getValue());
        }
    }
}
