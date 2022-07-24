package homework.task20.task37;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) throws ScannerException {
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(input.nextLine());
            if (x == 0) {
                throw new ScannerException("ВВЕДИТЕ ЧТО-то КРОМЕ НУЛЯ!");
                }
            }
        }
    }

