package newcar;

public class Car {
    private int age;
    private double speed;

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    private int weight;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
        this.age = 1000;
        this.speed = 1000;
        this.weight = 500000;
        this.color = "BLACK";
    }

    public Car(int age) {
        this.age = age;
        this.speed = 1500;
    }

    public Car(int age, double speed) {
        this.age = age;
        this.speed = speed;
    }

    public Car(int age, double speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int age, double speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(10);
        Car car3 = new Car(8, 350);
        Car car4 = new Car(5, 250, 1200);
        Car car5 = new Car(3, 185, 1100, "Фиолет");
        Car car6 = new Car();
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
    }
}
