package L05_Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOfInts = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int bombNum = sc.nextInt();
        int power = sc.nextInt();

        int index = 0;
        int sum = 0;

        List<Integer> intsToBeRemoved = new ArrayList<>();

        while (listOfInts.contains(bombNum)) {
            for (int i = 0; i < listOfInts.size(); i++) {
                if (listOfInts.get(i) == bombNum) {
                    index = i;
                    break;
                }
            }

            int leftBound = Math.max(0, index - power);
            int rightBound = Math.min(listOfInts.size() - 1, index + power);

            for (int i = leftBound; i <= rightBound; i++) {
                intsToBeRemoved.add(listOfInts.get(i));
            }

            listOfInts.removeAll(intsToBeRemoved);
        }

        for (Integer num : listOfInts) {
            sum += num;
        }

        System.out.println(sum);

    }
}
