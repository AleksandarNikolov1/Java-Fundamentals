package L05_Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();


        for (int i = 0; i <= integerList.size() / 2; i++) {
            if (i == integerList.size() - 1 - i)
                resultList.add(integerList.get(i));

            else {
                int result = integerList.get(i) + integerList.get(integerList.size() - 1 - i);
                resultList.add(result);
            }

            if (i + 1 == integerList.size() - 1 - i)
                break;
        }


        for (Integer result : resultList) {
            System.out.print(result + " ");
        }
    }
}
