package L06_Objects_and_Classes.Exercise.P04_Articles_2;

import java.util.ArrayList;
import java.util.List;
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Article> articles = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = sc.nextLine().split(", ");

            String title = tokens[0];
            String content = tokens[1];
            String author = tokens[2];

            Article article = new Article(title, content, author);

            articles.add(article);
        }

        String criteria = sc.nextLine();

        switch (criteria){
            case "title":
                articles.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "content":
                articles.stream().sorted((a, b) -> a.getContent().compareTo(b.getContent()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
            case "author":
                articles.stream().sorted((a, b) -> a.getAuthor().compareTo(b.getAuthor()))
                        .forEach(a -> System.out.println(a.toString()));
                break;
        }
    }
}

