package L08_Text_Processing.Lab;

import java.util.Scanner;

public class P02_RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = sc.nextLine().split("\\s+");
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                result = result.concat(strings[i]);
            }
        }

        System.out.println(result);
    }
}
