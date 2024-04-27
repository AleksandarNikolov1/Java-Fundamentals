package L06_Objects_and_Classes.Exercise.P02_Articles;

import java.util.Scanner;

public class Article {

    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String content){
        this.content = content;
    }

    public void changeAuthor(String author){
        this.author = author;
    }

    public void rename(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0){
            String[] tokens = sc.nextLine().split(": ");
            String command = tokens[0];

            switch (command){
                case "Edit":
                    String newContent = tokens[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = tokens[1];
                    article.changeAuthor(newAuthor);
                    break;
                case "Rename":
                    String newTitle = tokens[1];
                    article.rename(newTitle);
                    break;
            }
        }

        System.out.println(article.toString());
    }

}