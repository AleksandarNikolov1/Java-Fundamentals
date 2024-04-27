package L07_Associative_Arrays_Lambda_and_Stream_API.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> doubleList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(d -> Double.parseDouble(d)).collect(Collectors.toList());

        TreeMap<Double, Integer> map = new TreeMap<>();

        for (Double d : doubleList) {
            map.putIfAbsent(d, 0);
            map.put(d, map.get(d) + 1);
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
