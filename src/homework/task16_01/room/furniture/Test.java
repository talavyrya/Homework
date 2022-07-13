package homework.task16_01.room.furniture;

import homework.task16_01.Flat;
import homework.task16_01.room.Room;

public class Test {
    public static void main(String[] args) {
        Flat petrovskiy = new Flat(3, 25000);
        Flat polya = new Flat(2, 35000);
        Room first = new Room(4, "Wood");
        Room second = new Room(2, "Linoleum");
        Flat yavir = new Room(1, "Wood");
        System.out.println(first);
        System.out.println(polya);
        System.out.println(petrovskiy);
        System.out.println(second);
        System.out.println(yavir);
        first.setPrice(10000);
        second.setPrice(8500);
        System.out.println("Price for room " + first.getPrice() + "$");
        first.report();
        polya.report();
        yavir.report();
    }
}
