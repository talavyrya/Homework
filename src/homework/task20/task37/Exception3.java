package homework.task20.task37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        File first = new File("test");
 //       try {
//            Scanner input = new Scanner(first); // Checked Exception - когда ошибка обнаруживается
//            // в течении написания кода
//        } catch (FileNotFoundException e) {
//            System.out.println("ФАЙЛ не найден, введите другой путь");
//        }
        String word = "Word";
        int x = Integer.parseInt(word);
        System.out.println(x); // Runtime exception, не показывает ошибку , пока программа не запущена
       // int abc = "12345"; // Checked Exception
    }
}
