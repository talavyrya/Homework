package homework.task20.task36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "Dmytro" + separator + "IdeaProjects" + separator + "homework" + separator + "src" + separator
                + "homework" + separator + "task20" + separator + "task36" + separator + "example.txt";
        File myfile = new File(path);
        Scanner input = new Scanner(myfile);
        String words = input.nextLine();
        System.out.println("Вывод строки файла 1: " + words);
        String[] newArray = words.split(" ");
        System.out.println("Массив из элементов первой строки: " + Arrays.toString(newArray));
        System.out.println("-----------------");
        System.out.println("Вывод строк из файла: "); // первую строку почему-то не видит
        while (input.hasNextLine()) {
            input.next();
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
