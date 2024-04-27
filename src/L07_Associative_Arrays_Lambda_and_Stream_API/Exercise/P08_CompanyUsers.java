package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.*;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, List<String>> companies = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            companies.putIfAbsent(companyName, new ArrayList<>());
            if (!companies.get(companyName).contains(employeeId))
                companies.get(companyName).add(employeeId);

            input = sc.nextLine();
        }

        companies.entrySet().stream().sorted((c1, c2) -> c2.getKey().compareTo(c1.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    for (String id : c.getValue()) {
                        System.out.printf("-- %s%n", id);
                    }
                });
    }
}
