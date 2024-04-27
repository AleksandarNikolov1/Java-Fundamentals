package L05_Lists.Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> listOfDoubles = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < listOfDoubles.size() - 1; i++) {

            double currentEl = listOfDoubles.get(i);
            double nextEl = listOfDoubles.get(i + 1);

            if (currentEl == nextEl){
                listOfDoubles.set(i, currentEl + nextEl);
                listOfDoubles.remove(i + 1);
                i = -1;
            }
        }

        for (Double el : listOfDoubles) {
            System.out.print(new DecimalFormat("0.#").format(el) + " ");
        }
    }
}
