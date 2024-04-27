package L02_Data_Types_and_Variables.More_Exercise;
import java.util.Scanner;

public class P02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n -- > 0){

            String input = sc.nextLine();
            long firstNum = Long.parseLong(input.split(" ")[0]);
            long secondNum = Long.parseLong(input.split(" ")[1]);

            long greaterNum = Math.max(firstNum, secondNum);

            String greaterNumAsString = String.valueOf(greaterNum);

            int sum = 0;

            for (int i = 0; i < greaterNumAsString.length(); i++) {
                int digit = Integer.parseInt(String.valueOf(greaterNumAsString.charAt(i)));
                sum += digit;
            }

            System.out.println(sum);
        }
    }
}
