package L08_Text_Processing.Exercise;

import java.util.*;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        int strength = 0;
        for (int i = 0; i < charArr.length; i++) {
            char currentChar = charArr[i];

            if (currentChar == '>') {
                sb.append(currentChar);
                strength += Character.getNumericValue(charArr[i + 1]);
            }

            else if (strength > 0) {
                strength--;
            }

            else {
                sb.append(currentChar);
            }
        }

        System.out.println(sb.toString());
    }
}
