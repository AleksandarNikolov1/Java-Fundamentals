package L05_Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOfInts = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("end")) {

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            int num;
            int index;

            switch (command) {
                case "Add":
                    num = Integer.parseInt(tokens[1]);
                    add(listOfInts, num);
                    break;
                case "Remove":
                    num = Integer.parseInt(tokens[1]);
                    remove(listOfInts, num);
                    break;
                case "RemoveAt":
                    index = Integer.parseInt(tokens[1]);
                    removeAt(listOfInts, index);
                    break;
                case "Insert":
                    num = Integer.parseInt(tokens[1]);
                    index = Integer.parseInt(tokens[2]);
                    insert(listOfInts, num, index);
                    break;
            }

            input = sc.nextLine();
        }

        for (Integer num : listOfInts) {
            System.out.print(num + " ");
        }
    }

    private static void add(List<Integer> list, int num) {
        list.add(num);
    }

    private static void remove(List<Integer> list, Integer num) {
        list.remove(num);
    }

    private static void removeAt(List<Integer> list, int index) {
        list.remove(index);
    }

    private static void insert(List<Integer> list, int num, int index){
        list.add(index, num);
    }
}
