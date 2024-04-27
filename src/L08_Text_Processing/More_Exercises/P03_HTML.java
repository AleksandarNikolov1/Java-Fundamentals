package L08_Text_Processing.More_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_HTML {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String content = sc.nextLine();
        String comment = sc.nextLine();

        List<String> list = new ArrayList<>();

        list.add("<h1>");
        list.add(title);
        list.add("</h1>");
        list.add("<article>");
        list.add(content);
        list.add("</article>");

        while (!comment.equals("end of comments")) {
            list.add("<div>");
            list.add(comment);
            list.add("</div>");

            comment = sc.nextLine();
        }

        for (String s : list) {
            if (!s.contains("<>"))
                System.out.println(s);

            else
                System.out.println("   " + s);
        }


    }
}
