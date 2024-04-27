package L03_Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeField = Integer.parseInt(sc.nextLine());
        int[] indexes = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int[] ladyBugs = new int[sizeField];

        for (int i = 0; i < indexes.length; i++) {
            for (int j = 0; j < ladyBugs.length; j++) {
                if (indexes[i] == j)
                    ladyBugs[j] = 1;
            }
        }

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            int ladyBugIndex = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (ladyBugIndex >= 0 && ladyBugIndex < ladyBugs.length) {

                if (ladyBugs[ladyBugIndex] == 1) {

                    if (direction.equals("right")) {

                        if (ladyBugIndex + flyLength > ladyBugs.length - 1) {
                            ladyBugs[ladyBugIndex] = 0;
                        }

                        else {

                            ladyBugs[ladyBugIndex] = 0;

                            if (ladyBugs[ladyBugIndex + flyLength] == 0) {
                                ladyBugs[ladyBugIndex + flyLength] = 1;
                            }

                            else {
                                for (int i = ladyBugIndex + flyLength; i < ladyBugs.length; i += flyLength) {
                                    if (ladyBugs[i] == 0) {
                                        ladyBugs[i] = 1;
                                        break;
                                    }
                                }
                            }
                        }
                    }


                    else if (direction.equals("left")) {

                        if (ladyBugIndex - flyLength < 0) {
                            ladyBugs[ladyBugIndex] = 0;
                        }

                        else {

                            ladyBugs[ladyBugIndex] = 0;

                            if (ladyBugs[ladyBugIndex - flyLength] == 0) {
                                ladyBugs[ladyBugIndex - flyLength] = 1;
                            }

                            else {
                                for (int i = ladyBugIndex - flyLength - 1; i >= 0; i -= flyLength) {
                                    if (ladyBugs[i] == 0) {
                                        ladyBugs[i] = 1;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            input = sc.nextLine();
        }

        String result = Arrays.stream(ladyBugs).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
