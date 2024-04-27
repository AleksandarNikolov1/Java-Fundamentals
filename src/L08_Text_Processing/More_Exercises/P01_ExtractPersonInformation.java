package L08_Text_Processing.More_Exercises;

import java.util.Scanner;

public class P01_ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){
            String input = sc.nextLine();

            String name = input.substring(input.indexOf("@") + 1, input.indexOf("|"));
            String age = input.substring(input.indexOf("#") + 1, input.indexOf("*"));

            System.out.printf("%s is %s years old.%n", name, age);;
        }
    }
}
