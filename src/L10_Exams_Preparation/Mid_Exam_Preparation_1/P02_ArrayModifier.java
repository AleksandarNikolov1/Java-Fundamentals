package L10_Exams_Preparation.Mid_Exam_Preparation_1;

import java.util.Arrays;
import java.util.Scanner;

public class P02_ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String input = sc.nextLine();

        while (!input.equals("end")){

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            int firstIndex = 0;
            int secondIndex = 0;

            if (tokens.length > 1){
                firstIndex = Integer.parseInt(tokens[1]);
                secondIndex = Integer.parseInt(tokens[2]);
            }

            switch (command){
                case "swap":
                    swap(ints, firstIndex, secondIndex);
                    break;
                case "multiply":
                    multiply(ints, firstIndex, secondIndex);
                    break;
                case "decrease":
                    decreaseByOne(ints);
                    break;
            }

            input = sc.nextLine();
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ints.length - 1; i++) {
            sb.append(ints[i]).append(", ");
        }

        sb.append(ints[ints.length - 1]);

        System.out.println(sb.toString());

        double avg = Arrays.stream(ints).average().getAsDouble();
    }

    private static void swap(int[] arr, int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    private static void multiply(int[] arr, int firstIndex, int secondIndex){
        arr[firstIndex] = arr[firstIndex] * arr[secondIndex];
    }

    private static void decreaseByOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
    }
}
