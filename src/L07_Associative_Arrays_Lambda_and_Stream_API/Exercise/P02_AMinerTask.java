package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String resource = sc.nextLine();

        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(sc.nextLine());

            resources.putIfAbsent(resource, 0);
            resources.put(resource, resources.get(resource) + quantity);

            resource = sc.nextLine();
        }

        for (var entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
