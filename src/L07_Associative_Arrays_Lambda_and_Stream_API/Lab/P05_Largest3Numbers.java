package L07_Associative_Arrays_Lambda_and_Stream_API.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> ints = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a)).limit(3).collect(Collectors.toList());

        ints.forEach(e -> System.out.print(e + " "));
    }
}
