package L07_Associative_Arrays_Lambda_and_Stream_API.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04_WordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(s -> s.length() % 2 == 0).toArray(String[]::new);

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
