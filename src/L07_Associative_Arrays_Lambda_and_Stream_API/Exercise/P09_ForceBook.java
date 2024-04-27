package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.*;

public class P09_ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, List<String>> forceBook = new LinkedHashMap<>();


        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String side = input.split(" \\| ")[0];
                String user = input.split(" \\| ")[1];

                forceBook.putIfAbsent(side, new ArrayList<>());
                forceBook.get(side).add(user);

            } else if (input.contains("->")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                if (isUserExist(forceBook, forceUser)){
                    transferUser(forceBook, forceUser, forceSide);
                }

                else{
                    forceBook.putIfAbsent(forceSide, new ArrayList<>());
                    forceBook.get(forceSide).add(forceUser);
                }

                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

            }

            input = sc.nextLine();
        }

        forceBook.entrySet().stream().sorted((s1, s2) -> Integer.compare(s2.getValue().size(), s1.getValue().size()))
                .forEach(s -> {

                    if (s.getValue().size() > 0) {
                        System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());

                        s.getValue().stream().sorted((u1, u2) -> u2.compareTo(u1))
                                .forEach(u -> System.out.printf("! %s%n", u));
                    }
                });
    }

    private static boolean isUserExist(Map<String, List<String>> map, String user){
        for (List<String> list : map.values()) {
            if (list.contains(user))
                return true;
        }
        return false;
    }

    private static void transferUser(Map<String, List<String>> map, String user, String side){
        if (isUserExist(map, user)){
            for (List<String> list : map.values()) {
                list.remove(user);
            }
        }

        map.get(side).add(user);
    }
}
