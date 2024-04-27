package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intsArray = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int sumOfTwoEls = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < intsArray.length; i++) {
            for (int j = i + 1; j < intsArray.length; j++) {
                if (intsArray[i] + intsArray[j] == sumOfTwoEls){
                    int firstEl = intsArray[i];
                    int secondEl = intsArray[j];
                    System.out.println(firstEl + " " + secondEl);
                    break;
                }
            }
        }
    }
}
