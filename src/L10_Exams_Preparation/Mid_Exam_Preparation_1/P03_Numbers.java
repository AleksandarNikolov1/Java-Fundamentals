package L10_Exams_Preparation.Mid_Exam_Preparation_1;

import java.util.*;


public class P03_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        double average = Arrays.stream(ints).average().getAsDouble();

        List<Integer> resultList = new ArrayList<>();


        for (int i : ints) {
            if (i > average) {
                resultList.add(i);
            }
        }

        Collections.sort(resultList);
        Collections.reverse(resultList);


        if (resultList.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(resultList.get(i) + " ");
            }
        }

        else if (resultList.isEmpty())
            System.out.print("No");


        else {
            for (Integer i : resultList) {
                System.out.print(i + " ");
            }
        }
    }
}
