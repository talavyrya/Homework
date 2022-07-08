package alisherov;

public class Final {
    public static final double height = 2.5;
    private double lenght;
    private double widht;

    public static int rooms;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public Final(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
        rooms++;
    }

    public double volume() {
        double volume = height * lenght * widht;
        return volume;
    }

    public static void main(String[] args) {
        Final room1 = new Final(4.5, 3);
        Final room2 = new Final(3, 4);
        Final room3 = new Final(6, 3.5);
        System.out.println("Постоянная величина квартиры - это высота: " + height);
        System.out.println("Обьем комнаты 1 в квартире: " + room1.volume() + " кубических метра");
        System.out.println("Обьем комнаты 2 в квартире: " + room2.volume() + " кубических метра");
        System.out.println("Обьем комнаты 3 в квартире: " + room3.volume() + " кубических метра");
        System.out.println("Количество комнат в квартире: " + rooms);
    }
}
