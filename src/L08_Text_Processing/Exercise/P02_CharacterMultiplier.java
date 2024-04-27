package L08_Text_Processing.Exercise;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String firstStr = input.split(" ")[0];
        String secondStr = input.split(" ")[1];

        int minLength = Math.min(firstStr.length(), secondStr.length());

        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += (int) firstStr.charAt(i) * (int) secondStr.charAt(i);
        }

        if (firstStr.length() < secondStr.length()){
            for (int i = firstStr.length(); i < secondStr.length(); i++) {
                sum += (int) secondStr.charAt(i);
            }
        }

        else if (secondStr.length() < firstStr.length()){
            for (int i = secondStr.length(); i < firstStr.length(); i++) {
                sum += (int) firstStr.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
