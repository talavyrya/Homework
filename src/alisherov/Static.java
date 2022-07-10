package alisherov;

public class Static {
    private double radius;
    public static double pi = 3.14;
    public static int count;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Static(double radius) {
        this.radius = radius;
        count++;
    }

    public Static() {
        this.radius = 1;
        count++;
    }

    public double square() {
        double square = pi * Math.pow(radius, 2);
        return square;
    }

    public double lenght() {
        double lenght = pi * 2 * radius;
        return lenght;
    }

    public static void main(String[] args) {
        Static circle = new Static(12);
        Static circle2 = new Static(25.5);
        Static circle3 = new Static();
        System.out.println("площадь окружности 1: " + circle.square());
        System.out.println("площадь окружности 2: " + circle2.square());
        System.out.println("площадь окружности 3: " + circle3.square());
        System.out.println("Длинна окружности 1: " + circle.lenght());
        System.out.println("Длинна окружности 2: " + circle2.lenght());
        System.out.println("Длинна окружности 3: " + circle3.lenght());
        System.out.println("Постоянная величина ПИ: " + Static.pi);
        System.out.println("Количество фигур: " + count);
        Static circle4 = new Static();
        System.out.println("New Количество фигур: " + count);
    }
}
