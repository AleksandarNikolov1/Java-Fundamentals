package L11_Final_Exam;

import java.util.Scanner;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){
            String barcode = sc.nextLine();
            char[] arr = barcode.toCharArray();

            boolean isValid = true;

            if (arr[0] != '@')
                isValid = false;

            if (arr[1] != '#')



            for (int i = 0; i < arr.length; i++) {

            }
        }
    }
}
