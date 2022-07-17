package task18_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите величину для преобразования: ");
        Distance.distance = input.nextDouble();
        Distance.print();
    }
}

