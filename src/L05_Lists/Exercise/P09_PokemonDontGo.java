package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> distances = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemovedElements = 0;
        int removedElement = 0;


        while (!distances.isEmpty()) {

            int index = Integer.parseInt(sc.nextLine());


            if (index >= 0 && index <= distances.size() - 1) {
                 removedElement = distances.remove(index);
            }

            else if (index < 0){
                 removedElement =  distances.remove(0);
                 distances.add(0, distances.get(distances.size() - 1));
            }

            else if (index > distances.size() - 1){
                 removedElement = distances.remove(distances.size() - 1);
                 distances.add(distances.get(0));
            }

            for (int j = 0; j < distances.size(); j++) {
                if (distances.get(j) <= removedElement) {
                    distances.set(j, distances.get(j) + removedElement);
                }

                else if (distances.get(j) > removedElement) {
                    distances.set(j, distances.get(j) - removedElement);
                }
            }

            sumOfRemovedElements += removedElement;
        }

        System.out.println(sumOfRemovedElements);
    }
}


