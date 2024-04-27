package L05_Lists.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> intsList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        intsList.removeIf(n -> (n < 0));
        Collections.reverse(intsList);

        if (intsList.size() == 0)
            System.out.println("empty");

        else {
            for (Integer integer : intsList) {
                System.out.print(integer + " ");
            }
        }
    }
}
