package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> intsList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")){

            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            Integer element = Integer.parseInt(tokens[1]);

            if (command.equals("Insert")){
                int position = Integer.parseInt(tokens[2]);
                intsList.add(position, element);
            }

            else {
                intsList.remove(element);
            }

            input = sc.nextLine();
        }

        for (Integer integer : intsList) {
            System.out.print(integer + " ");
        }
    }
}
