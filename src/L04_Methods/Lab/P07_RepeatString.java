package L04_Methods.Lab;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {

        System.out.println(stringRepeater());

    }

    public static String stringRepeater (){

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String input = sc.nextLine();
        int times = Integer.parseInt(sc.nextLine());

        while (times -- > 0){
            sb.append(input);
        }

        return sb.toString();
    }
}
