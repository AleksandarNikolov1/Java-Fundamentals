package L03_Arrays.More_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        char[] vowels = new char[]{'a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U'};

        int[] codes = new int[n];

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            char[] arrChars = input.toCharArray();

            int code = 0;

            for (int j = 0; j < arrChars.length; j++) {
                char currentChar = arrChars[j];
                boolean isVowel = false;

                for (int k = 0; k < vowels.length; k++) {
                    if (currentChar == vowels[k]){
                        isVowel = true;
                        break;
                    }
                }

                if (isVowel)
                    code += currentChar * arrChars.length;

                else
                    code += currentChar / arrChars.length;
            }

            codes[i] = code;
        }

        Arrays.sort(codes);

        for (int code : codes) {
            System.out.println(code);
        }
    }
}
