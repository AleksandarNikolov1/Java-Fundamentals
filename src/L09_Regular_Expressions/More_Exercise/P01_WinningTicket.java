package L09_Regular_Expressions.More_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P01_WinningTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tickets = Arrays.stream(sc.nextLine().split("\\s*,\\s*")).collect(Collectors.toList());

        List<Character> winningSymbols = new ArrayList<>();
        winningSymbols.add('@');
        winningSymbols.add('^');
        winningSymbols.add('#');
        winningSymbols.add('$');


        String regex = "[$@#^]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;


        for (String ticket : tickets) {

            int leftCounter = 0;
            int rightCounter = 0;
            char winningSymbol = ' ';

            matcher = pattern.matcher(ticket);

            if (ticket.length() == 20) {
                String firstHalf = ticket.substring(0, 10);
                String secondHalf = ticket.substring(10);


                for (int i = 0; i < firstHalf.length(); i++) {
                    char currentChar = firstHalf.charAt(i);
                    int fhl = 1;
                    if (winningSymbols.contains(currentChar)) {
                        winningSymbol = currentChar;
                        for (int j = i + 1; j < firstHalf.length(); j++) {
                            char followingChar = firstHalf.charAt(j);
                            if (currentChar == followingChar) {
                                fhl++;
                                i = j;
                            }
                            if (fhl > leftCounter)
                                leftCounter = fhl;
                        }
                    }

                }

                for (int i = 0; i < secondHalf.length(); i++) {
                    char currentChar = secondHalf.charAt(i);
                    int shl = 1;
                    if (winningSymbols.contains(currentChar)) {
                        for (int j = i + 1; j < secondHalf.length(); j++) {
                            char followingChar = secondHalf.charAt(j);
                            if (currentChar == followingChar) {
                                shl++;
                                i = j;
                            }
                            if (shl > rightCounter)
                                rightCounter = shl;
                        }
                    }


                }


            } else if (ticket.length() < 20)
                System.out.println("invalid ticket");

            else if (!matcher.find())
                System.out.printf("ticket \"%s\" - no match%n", ticket);







            if (leftCounter == rightCounter && leftCounter > 5) {
                if (leftCounter == 10)
                    System.out.printf("ticket \"%s\" - %d%s Jackpot!%n", ticket, leftCounter, winningSymbol);

                else
                    System.out.printf("ticket \"%s\" - %d%s%n", ticket, leftCounter, winningSymbol);
            }

        }

    }
}
