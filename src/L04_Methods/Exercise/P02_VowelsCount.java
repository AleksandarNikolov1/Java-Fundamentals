package L04_Methods.Exercise;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(getVowelsCount(input));
    }

    private static int getVowelsCount (String str){

        int vowelsCounter = 0;
        char[] vowels = new char[]{'a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U'};
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j])
                    vowelsCounter++;
            }
        }

        return vowelsCounter;
    }
}
