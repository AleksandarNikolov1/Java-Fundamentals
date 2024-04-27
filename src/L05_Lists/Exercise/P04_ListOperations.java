package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listOfInts = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = sc.nextLine();

        int num;
        int index;
        int count;

        while (!input.equals("End")) {

            String command = input.split("\\s+")[0];

            switch (command) {
                case "Add":
                    num = Integer.parseInt(input.split("\\s+")[1]);
                    add(listOfInts, num);
                    break;
                case "Insert":
                    num = Integer.parseInt(input.split("\\s+")[1]);
                    index = Integer.parseInt(input.split("\\s+")[2]);
                    insert(listOfInts, num, index);
                    break;
                case "Remove":
                    index = Integer.parseInt(input.split("\\s+")[1]);
                    remove(listOfInts, index);
                    break;
                case "Shift":
                    String direction = input.split("\\s+")[1];
                    count = Integer.parseInt(input.split("\\s+")[2]);
                    shift(listOfInts, direction, count);
                    break;
            }

            input = sc.nextLine();
        }

        printList(listOfInts);
    }

    private static void add(List<Integer> list, int num) {
        list.add(num);
    }

    private static void insert(List<Integer> list, int num, int index) {
        if (indexIsValid(list, index))
            list.add(index, num);
    }

    private static void remove(List<Integer> list, int index) {
        if (indexIsValid(list, index))
            list.remove(index);
    }

    private static void shift(List<Integer> list, String direction, int count) {
        if (direction.equals("left")) {
            for (int i = 0; i < count; i++) {
                list.add(list.get(0));
                list.remove(0);
            }
        }

        else if (direction.equals("right")) {
            for (int i = 0; i < count; i++) {
                list.add(0, list.get(list.size() - 1));
                list.remove(list.size() - 1);
            }
        }
    }

    private static boolean indexIsValid(List<Integer> list, int index) {
        if (index > -1 && index < list.size())
            return true;

        else {
            System.out.println("Invalid index");
            return false;
        }
    }

    private static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
