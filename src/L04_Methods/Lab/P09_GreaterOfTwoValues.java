package L04_Methods.Lab;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataType = sc.nextLine();

        switch (dataType){
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());
                int intResult = getMax(firstNum, secondNum);
                System.out.println(intResult);
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                char charResult = getMax(firstChar, secondChar);
                System.out.println(charResult);
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                String stringResult = getMax(firstString, secondString);
                System.out.println(stringResult);
                break;
        }


    }

    private static int getMax(int a, int b){
        return Math.max(a, b);
    }

    private static char getMax(char a, char b){
       return (char) Math.max(a, b);
    }

    private static String getMax(String a, String b){
        if (a.compareTo(b) > 0)
            return a;
        else
            return b;
    }
}
