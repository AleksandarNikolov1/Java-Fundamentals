package L08_Text_Processing.Exercise;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String filePath = sc.nextLine();

        String fullFileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
        String fileName = fullFileName.substring(0, fullFileName.indexOf("."));
        String extension = fullFileName.substring(fullFileName.indexOf(".") + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}
