package L02_Data_Types_and_Variables.More_Exercise;

import java.util.Scanner;

public class P06_BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        boolean isBalanced = true;

        StringBuilder sb = new StringBuilder();

        while (n-- > 0){
            String input = sc.nextLine();

            if (input.equals("("))
                sb.append("(");

            else if (input.equals(")"))
                sb.append(")");
        }

        String brackets = sb.toString();

        if (brackets.length() % 2 == 0){
            for (int i = 0; i < brackets.length(); i++) {
                if (i % 2 == 0 && brackets.charAt(i) != '(') {
                    isBalanced = false;
                    break;
                }
                else if (i % 2 == 1 && brackets.charAt(i) != ')'){
                    isBalanced = false;
                    break;
                }
            }
        }

        else
            isBalanced = false;

        if (isBalanced)
            System.out.println("BALANCED");

        else
            System.out.println("UNBALANCED");



    }
}
