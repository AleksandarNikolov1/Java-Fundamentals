package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayerDeck = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (firstPlayerDeck.size() > 0 && secondPlayerDeck.size() > 0) {

            int i = 0;

            int firstPlayerCard = firstPlayerDeck.get(i);
            int secondPlayerCard = secondPlayerDeck.get(i);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerDeck.add(secondPlayerCard);
                firstPlayerDeck.add(firstPlayerCard);

                firstPlayerDeck.remove(i);
                secondPlayerDeck.remove(i);
            }

            else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerDeck.add(firstPlayerCard);
                secondPlayerDeck.add(secondPlayerCard);

                secondPlayerDeck.remove(i);
                firstPlayerDeck.remove(i);
            }

            else {
                firstPlayerDeck.remove(i);
                secondPlayerDeck.remove(i);
            }
        }

        int sum = 0;

        if (!firstPlayerDeck.isEmpty()) {
            for (Integer card : firstPlayerDeck) {
                sum += card;
            }

            System.out.printf("First player wins! Sum: %d", sum);
        }

        else if (!secondPlayerDeck.isEmpty()) {
            for (Integer card : secondPlayerDeck) {
                sum += card;
            }

            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
