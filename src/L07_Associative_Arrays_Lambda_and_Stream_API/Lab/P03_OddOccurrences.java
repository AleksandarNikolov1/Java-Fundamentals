package L07_Associative_Arrays_Lambda_and_Stream_API.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = Arrays.stream(sc.nextLine().toLowerCase(Locale.ROOT).split("\\s+"))
                .collect(Collectors.toList());

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);
        }

        List<String> oddOccurrences = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1 && !oddOccurrences.contains(entry.getKey())){
                oddOccurrences.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddOccurrences));
    }
}
