package L08_Text_Processing.More_Exercises;

import java.util.Scanner;

public class P02_AsciiSumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstChar = sc.nextLine().charAt(0);
        char secondChar = sc.nextLine().charAt(0);
        String randomString = sc.nextLine();

        int sum = 0;


        for (char c : randomString.toCharArray()) {
            if (c > firstChar && c < secondChar)
                sum += c;
        }
        System.out.println(sum);
    }
}


