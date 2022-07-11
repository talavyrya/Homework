package task11;

import java.util.Scanner;

public class Rectangle {
    private static double side1;
    private static double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public static double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public static double perimeterCalculator(double side1, double side2) {
        double perimeter = 2 * (side1 + side2);
        return perimeter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первую сторону прямоугольника: ");
        side1 = input.nextDouble();
        System.out.println("Введите вторую сторону прямоугольника: ");
        side2 = input.nextDouble();
        areaCalculator(side1, side2);
        perimeterCalculator(side1, side2);
        System.out.println("Площадь прямоугольника = " + areaCalculator(side1, side2) + " условных квадратных единиц");
        System.out.println("Периметр прямоугольника = " + perimeterCalculator(side1, side2) + " условных единиц");
        input.close();
    }
}
