package homework.task18.forth;

public class Vehicle {
    public void print() {
        System.out.println("Main outside class");
    }

    public class Wheel {
        public void print() {
            System.out.println("First nested class");
        }
    }

    public class Door {
        public void print() {
            System.out.println("Second nested class");
        }
    }

    public static void main(String[] args) {
        Vehicle first = new Vehicle();
        Vehicle.Wheel nested1 = first.new Wheel();
        Vehicle.Wheel nested2 = new Vehicle().new Wheel();
        Vehicle.Door nested3 = first.new Door();
        Vehicle.Door nested4 = new Vehicle().new Door();
        first.print();
        nested1.print();
        nested4.print();
    }
}
