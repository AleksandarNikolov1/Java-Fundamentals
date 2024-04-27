package L07_Associative_Arrays_Lambda_and_Stream_API.Exercise;

import java.util.*;

public class P07_StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, List<Double>> notebook = new LinkedHashMap<>();

        while (n-- > 0){

            String student = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());

            notebook.putIfAbsent(student, new ArrayList<>());
            notebook.get(student).add(grade);
        }

        LinkedHashMap<String, Double> finalGrades = new LinkedHashMap<>();

        for (var entry : notebook.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();

            finalGrades.put(entry.getKey(), avg);
        }

        finalGrades.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                .filter(s -> s.getValue() >= 4.50).
                forEach(s -> System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue()));

    }
}
