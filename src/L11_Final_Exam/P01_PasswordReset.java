package L11_Final_Exam;

import java.util.Scanner;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        String input = sc.nextLine();

        while (!input.equals("Done")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "TakeOdd":
                    password = takeOdd(password);
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(tokens[1]);
                    int length = Integer.parseInt(tokens[2]);
                    password = cut(password, index, length);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = tokens[1];
                    String substitute = tokens[2];
                    if (password.contains(substring)) {
                        password = substitute(password, substring, substitute);
                        System.out.println(password);
                    }
                    else
                        System.out.println("Nothing to replace!");
                    break;

            }

            input = sc.nextLine();
        }

        System.out.println("Your password is: " + password);
    }

    private static String takeOdd(String text){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 1)
                sb.append(text.charAt(i));
        }

        return sb.toString();
    }

    private static String cut(String text, int index, int length){
        String substring = text.substring(index, index + length);
        text = text.replaceFirst(substring, "");

        return text;
    }

    private static String substitute(String text, String substring, String substitute){

        text = text.replaceAll(substring, substitute);

        return text;
    }
}
