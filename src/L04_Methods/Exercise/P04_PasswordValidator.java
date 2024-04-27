package L04_Methods.Exercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if (isValidPassword(password))
            System.out.println("Password is valid");

    }

    private static boolean isValidLength (String password){
        if (password.length() >= 6 && password.length() <= 10)
            return true;

        else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    private static boolean containsLettersAndDigitsOnly (String password){

        boolean isLetterOrDigit = true;

        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))){
                isLetterOrDigit = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }

        return isLetterOrDigit;
    }

    private static boolean hasAtLeast2Digits (String password){

        int digitsCounter = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                digitsCounter++;
        }

        if (digitsCounter >= 2){
           return true;
        }

        else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }


    private static boolean isValidPassword (String password) {

        boolean isValid = true;

        if (!isValidLength(password))
            isValid = false;

        if (!containsLettersAndDigitsOnly(password))
            isValid = false;

        if (!hasAtLeast2Digits(password))
            isValid = false;

        return isValid;
    }
}
