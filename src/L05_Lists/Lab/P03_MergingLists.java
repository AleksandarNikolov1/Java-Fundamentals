package L05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int lowerLength = Math.min(firstList.size(), secondList.size());

        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < lowerLength; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }

        List<Integer> listToAdd;

        if (firstList.size() >= secondList.size())
            listToAdd = firstList.subList(lowerLength, firstList.size());

        else
            listToAdd = secondList.subList(lowerLength, secondList.size());

        mergedList.addAll(listToAdd);

        for (Integer result : mergedList) {
            System.out.print(result + " ");
        }
    }
}
