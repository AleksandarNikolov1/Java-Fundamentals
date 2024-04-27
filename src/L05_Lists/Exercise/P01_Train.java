package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int wagonCapacity = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        while (!input.equals("end")) {

            if (input.contains("Add")) {
                int newWagon = Integer.parseInt(input.split("\\s+")[1]);
                wagons.add(newWagon);
            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= wagonCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }

            input = sc.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
