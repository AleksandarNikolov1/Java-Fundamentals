package L02_Data_Types_and_Variables.Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;

        while (n-- > 0){
            char c = sc.nextLine().charAt(0);
            sum += c;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
