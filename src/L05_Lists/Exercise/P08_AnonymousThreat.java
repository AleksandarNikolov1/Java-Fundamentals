//package Lists.Exercise;
//
//import com.sun.source.doctree.SeeTree;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class AnonymousThreat_08 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        List<String> strings = Arrays.stream(sc.nextLine().split(" ")).toList();
//
//        String input = sc.nextLine();
//
//        while (!input.equals("3:1")){
//            String[] tokens = input.split(" ");
//            String command = tokens[0];
//
//            switch (command){
//                case "merge":
//                    int startIndex = Integer.parseInt(tokens[1]);
//                    int endIndex = Integer.parseInt(tokens[2]);
//                    mergeStrings(strings, startIndex, endIndex);
//                    break;
//
//                case "divide":
//                    int index = Integer.parseInt(tokens[1]);
//                    int partitions = Integer.parseInt(tokens[2]);
//                    divideString(strings, index, partitions);
//                    break;
//            }
//
//            input = sc.nextLine();
//        }
//
//        System.out.println(String.join(" ", strings));
//    }
//
//    private static void mergeStrings (List<String> list, int startIndex, int endIndex){
//
//        StringBuilder sb = new StringBuilder();
//        List<String> toBeRemovedList = new ArrayList<>();
//
//        if (startIndex > 0 && endIndex < list.size() - 1){
//            for (int i = startIndex; i < endIndex; i++) {
//                sb.append(list.get(i));
//                toBeRemovedList.add(list.get(i));
//            }
//
//
//        }
//
//        else if (startIndex > 0 && endIndex > list.size() - 1) {
//            for (int i = startIndex; i < list.size(); i++) {
//                sb.append(list.get(i));
//                toBeRemovedList.add(list.get(i));
//
//            }
//        }
//
//        else if (startIndex < 0 && endIndex < list.size() - 1){
//            for (int i = 0; i < endIndex; i++) {
//                sb.append(list.get(i));
//                toBeRemovedList.add(list.get(i));
//            }
//        }
//
//        list.add(startIndex, sb.toString());
//        list.removeAll(toBeRemovedList);
//    }
//
//    private static void divideString (List<String> list, int index, int partitions){
//        String str = list.remove(index);
//
//        int division = str.length() / partitions;
//
//        List<String> toBeAddedStrings = new ArrayList<>();
//
//        for (int i = 0; i < str.length(); i+=division) {
//            String s = str.substring(i, i + division);
//            toBeAddedStrings.add(s);
//        }
//
//        list.addAll(index, toBeAddedStrings);
//    }
//}
