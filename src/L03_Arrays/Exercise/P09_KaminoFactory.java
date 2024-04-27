package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lengthDna = Integer.parseInt(sc.nextLine());

        String input = sc.nextLine();

        int bestLength = 1;
        String bestSequence = "";

        int bestStartingIndex = -1;
        int bestSequenceIndex = -1;
        int bestSum = 0;
        int counter = 0;

        while (!input.equals("Clone them!")) {

            counter ++;

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != '!')
                    sb.append(input.charAt(i));
            }

            int[] arr = new int[lengthDna];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(sb.charAt(i) + "");
            }

            for (int i = 0; i < arr.length; i++) {

                int currentLength = 1;
                int currentSum = Arrays.stream(arr).sum();

                if (arr[i] == 1) {

                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[j] == 1)
                            currentLength++;

                        else break;
                    }

                    if (currentLength > bestLength) {
                        bestLength = currentLength;
                        bestSequenceIndex = counter;
                        bestSequence = sb.toString();
                        bestStartingIndex = i;
                        bestSum = currentSum;
                    }

                    else if (currentLength == bestLength) {
                        if (i < bestStartingIndex) {
                            bestSequence = sb.toString();
                            bestSequenceIndex = counter;
                            bestStartingIndex = i;
                            bestSum = currentSum;
                        }

                        if (currentSum > bestSum){
                            bestSum = currentSum;
                            bestSequence = sb.toString();
                            bestSequenceIndex = counter;
                            bestStartingIndex = i;
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        String bestSeq = String.join(" ", bestSequence.split(""));
        System.out.printf("Best DNA sample %d with sum: %d.%n%s%n", bestSequenceIndex, bestSum, bestSeq);
    }
}
