package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.*;

public class P03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        Map<String, Integer> junks = new TreeMap<>();

        List<String> allLegItems = new ArrayList<>() {{
            add("shards");
            add("fragments");
            add("motes");
        }};

        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        boolean haveWinner = false;

        while (!haveWinner) {
            String[] tokens = sc.nextLine().split("\\s+");

            for (int i = 0; i < tokens.length; i++) {
                if (i % 2 == 0) {
                    String item = tokens[i + 1].toLowerCase(Locale.ROOT);
                    int count = Integer.parseInt(tokens[i]);

                    if (allLegItems.contains(item)) {
                      //  legendaryItems.putIfAbsent(item, 0);
                        legendaryItems.put(item, legendaryItems.get(item) + count);
                    } else {
                        junks.putIfAbsent(item, 0);
                        junks.put(item, junks.get(item) + count);
                    }
                }

                for (var e : legendaryItems.entrySet()) {
                    if (e.getValue() >= 250) {

                        String winner = "";

                        switch (e.getKey()) {
                            case "fragments":
                                winner = "Valanyr";
                                break;
                            case "shards":
                                winner = "Shadowmourne";
                                break;
                            case "motes":
                                winner = "Dragonwrath";
                                break;
                        }

                        System.out.printf("%s obtained!%n", winner);
                        legendaryItems.put(e.getKey(), e.getValue() - 250);

                        legendaryItems.entrySet().stream().sorted((a, b) ->{
                                int result = b.getValue().compareTo(a.getValue());
                                if (result == 0)
                                    result = a.getKey().compareTo(b.getKey());

                                return result;
                                })
                                .forEach(l -> System.out.printf("%s: %d%n", l.getKey(), l.getValue()));

                        junks.entrySet().stream().sorted((a, b) -> a.getKey().compareTo(b.getKey()))
                                .forEach(j -> System.out.printf("%s: %d%n", j.getKey(), j.getValue()));

                        haveWinner = true;
                    }
                }
            }
        }
    }
}
