package L03_Arrays.Exercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagons = Integer.parseInt(sc.nextLine());
        int [] train = new int[wagons];

        int people = 0;

        for (int i = 0; i < wagons; i++) {
            train[i] = Integer.parseInt(sc.nextLine());
            people += train[i];
        }

        for (int peoplePerWagon : train) {
            System.out.print(peoplePerWagon + " ");
        }

        System.out.println();

        System.out.println(people);

    }
}
