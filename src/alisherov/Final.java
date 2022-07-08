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
        System.out.println("���������� �������� �������� - ��� ������: " + height);
        System.out.println("����� ������� 1 � ��������: " + room1.volume() + " ���������� �����");
        System.out.println("����� ������� 2 � ��������: " + room2.volume() + " ���������� �����");
        System.out.println("����� ������� 3 � ��������: " + room3.volume() + " ���������� �����");
        System.out.println("���������� ������ � ��������: " + rooms);
    }
}
