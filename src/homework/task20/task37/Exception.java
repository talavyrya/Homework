package homework.task20.task37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args)  {
//        File task = new File("example.txt");
//        try {
//            Scanner input = new Scanner(task);
//            System.out.println("After Scanner");
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//        System.out.println("File in package, going continue"); // Другой способ обработки исключения в методе main
        try {
            fileFind();
            System.out.println("In case of mistake");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Обработка исключения в методе main");
        }
    }
    public static void fileFind() throws FileNotFoundException {
        File task = new File("example111.txt");
        Scanner input = new Scanner(task);
    }
}
