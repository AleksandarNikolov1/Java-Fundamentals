package L05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lessons = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("course start")){

            String[] tokens = input.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];

            switch (command){
                case "Add":
                    addLesson(lessons, lessonTitle);
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    insertLesson(lessons, lessonTitle, index);
                    break;
                case "Remove":
                    removeLesson(lessons, lessonTitle);
                    break;
                case "Swap":
                    String secondLessonTitle = tokens[2];
                    swapLessons(lessons, lessonTitle, secondLessonTitle);
                    break;
                case "Exercise":
                    addExercise(lessons, lessonTitle);
                    break;
            }

            input = sc.nextLine();
        }

        int counter = 1;

        for (String lesson : lessons) {
            System.out.println(counter +  "." + lesson);
            counter++;
        }
    }

    private static void addLesson (List<String> lessons, String lesson){
        if (!lessons.contains(lesson))
            lessons.add(lesson);
    }

    private static void insertLesson (List<String> lessons, String lesson, int index){
        if (!lessons.contains(lesson))
            lessons.add(index, lesson);
    }

    private static void removeLesson (List<String> lessons, String lesson){

        if (hasExercise(lessons, lesson))
            lessons.remove(lessons.indexOf(lesson) + 1);

        lessons.remove(lesson);
    }

    private static void swapLessons (List<String> lessons, String firstLesson, String secondLesson){

        if (lessons.contains(firstLesson) && lessons.contains(secondLesson)){

            if (hasExercise(lessons, firstLesson) && hasExercise(lessons, secondLesson)){
                String secondEx = lessons.get(lessons.indexOf(secondLesson) + 1);
                String firstEx = lessons.get(lessons.indexOf(firstLesson) + 1);

                lessons.set(lessons.indexOf(secondLesson) + 1, firstEx);
                lessons.set(lessons.indexOf(firstLesson) + 1, secondEx);
            }

            else if (hasExercise(lessons, firstLesson)){
                lessons.add(lessons.indexOf(secondLesson) + 1, lessons.remove(lessons.indexOf(firstLesson) + 1));
            }

            else if (hasExercise(lessons, secondLesson)){
                lessons.add(lessons.indexOf(firstLesson) + 1, lessons.remove(lessons.indexOf(secondLesson) + 1));
            }

            if (lessons.indexOf(firstLesson) < lessons.indexOf(secondLesson)) {
                lessons.set(lessons.indexOf(firstLesson), secondLesson);
                lessons.set(lessons.lastIndexOf(secondLesson), firstLesson);
            }

            else {
                lessons.set(lessons.indexOf(firstLesson), secondLesson);
                lessons.set(lessons.indexOf(secondLesson), firstLesson);
            }
        }
    }

    private static void addExercise(List<String> lessons, String lesson){
        if (lessons.contains(lesson) && !hasExercise(lessons, lesson)){
            lessons.add(lessons.indexOf(lesson) + 1, lesson + "-Exercise");
        }

        else{
            lessons.add(lesson);
            lessons.add(lesson + "-Exercise");
        }
    }

    private static boolean hasExercise(List<String> lessons, String lesson){
        if (lessons.indexOf(lesson) == lessons.size() - 1)
            return false;

        return lessons.get(lessons.indexOf(lesson) + 1).contains(lesson + "-Exercise");
    }
}
