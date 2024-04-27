package L07_Associative_Arrays_Lambda_and_Stream_API.Lab;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();

        while (n -- > 0){

            String word = sc.nextLine();
            String synonym = sc.nextLine();

            synonyms.putIfAbsent(word, new ArrayList<>());
            synonyms.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}
