package L04_Methods.More_Exrcise;

import java.util.Scanner;

public class P01_DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dataType = sc.nextLine();
        String input = sc.nextLine();

        switch (dataType){
            case "int":
                int intResult = calculate(Integer.parseInt(input));
                System.out.println(intResult);
                break;
            case "real":
                double doubleResult = calculate(Double.parseDouble(input));
                System.out.printf("%.2f", doubleResult);
                break;
            case "string":
                String strResult = calculate(input);
                System.out.println(strResult);
                break;
        }

    }

    private static int calculate (int n){
        return n * 2;
    }

    private static double calculate (double n){
        return n * 1.5;
    }

    private static String calculate (String str){
        return String.format("$%s$", str);
    }
}
