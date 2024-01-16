package Basic_Syntax_Conditional_Statements_and_Loops.lab;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();
        String language = "";
        boolean isKnown = true;

        if (country.equals("England") || country.equals("USA")){
            language = "English";
        }
        else if (country.equals("Spain") || country.equals("Argentina") || country.equals("Mexico")){
            language = "Spanish";
        }
        else {
            System.out.println("unknown");
            isKnown = false;
        }

        if (isKnown)
            System.out.println(language);
    }
}
