package L05_Lists.Exercise;

import java.util.*;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\|");

        StringBuilder result = new StringBuilder();

        for (int i = input.length - 1; i >= 0; i--) {

            String[] currentArr = input[i].split("\\s+");

            for (int j = 0; j < currentArr.length; j++) {

                if (!currentArr[j].equals(""))
                    result.append(currentArr[j]).append(" ");
            }

        }

        System.out.println(result);

    }
}
