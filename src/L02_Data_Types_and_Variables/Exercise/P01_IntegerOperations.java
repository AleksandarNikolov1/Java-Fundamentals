package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P01_IntegerOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int thirdNum = Integer.parseInt(sc.nextLine());
        int fourthNum = Integer.parseInt(sc.nextLine());

        int result = (firstNum + secondNum) / thirdNum * fourthNum;

        System.out.println(result);

    }
}
