package L10_Exams_Preparation.Mid_Exam_Preparation_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> items = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("Craft!")){

            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command){
                case "Collect":
                    if (!isItemExist(items, item))
                        addItem(items, item);
                    break;
                case "Drop":
                    if (isItemExist(items, item))
                        removeItem(items, item);
                    break;
                case "Combine Items":
                    String oldItem = item.split(":")[0];
                    String newItem = item.split(":")[1];
                    if (isItemExist(items, oldItem))
                        combineItems(items, oldItem, newItem);
                    break;
                case "Renew":
                    if (isItemExist(items, item))
                        renewItem(items, item);
                    break;

            }


            input = sc.nextLine();
        }

        System.out.println(String.join(", ", items));

    }

    private static boolean isItemExist(List<String> items, String item){
        return items.contains(item);
    }

    private static void addItem(List<String> items, String item){
            items.add(item);
    }

    private static void removeItem(List<String> items, String item){
        items.remove(item);
    }

    private static void renewItem(List<String> items, String item){
        items.remove(item);
        items.add(item);
    }

    private static void combineItems (List<String> items, String oldItem, String newItem){
        int index = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(oldItem)) {
                index = i;
                break;
            }
        }

        items.add(index + 1, newItem);
    }
}


//Iron, Sword
//Drop - Bronze
//Combine Items - Sword:Bow
//Renew - Iron
//Craft!

//Sword, Bow, Iron