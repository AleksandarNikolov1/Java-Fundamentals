package L05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> intsList = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            
            int num = 0;
            String condition = "";

            if (command.contains("Contains")) {
                num = Integer.parseInt(command.split("\\s+")[1]);
                command = "Contains";
            }
            else if (command.contains("Filter")){
                condition = command.split("\\s+")[1];
                num = Integer.parseInt(command.split("\\s+")[2]);
                command = "Filter";
            }

            switch (command) {
                case "Contains":
                    contains(intsList, num);
                    break;
                case "Print even":
                    printEven(intsList);
                    break;
                case "Print odd":
                    printOdd(intsList);
                    break;
                case "Get sum":
                    System.out.println(getSum(intsList));
                    break;
                case "Filter":
                    filter(intsList, condition, num);
                    break;
            }

            command = sc.nextLine();
        }

    }

    private static void contains(List<Integer> list, int num) {
        if (list.contains(num))
            System.out.println("Yes");

        else
            System.out.println("No such number");
    }

    private static void printEven(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 == 0)
                System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        
        for (Integer integer : list) {
            sum += integer;
        }
        
        return sum;
    }

    private static void filter(List<Integer> list, String condition, int number){
        switch (condition){
            case ">=":
                for (Integer integer : list) {
                    if (integer >= number)
                        System.out.print(integer + " ");
                }
                break;
            case ">":
                for (Integer integer : list) {
                    if (integer > number)
                        System.out.print(integer + " ");
                }
                break;
            case "<=":
                for (Integer integer : list) {
                    if (integer <= number)
                        System.out.print(integer + " ");
                }
                break;
            case "<":
                for (Integer integer : list) {
                    if (integer < number)
                        System.out.print(integer + " ");
                }
                break;
        }

        System.out.println();
    }
}
