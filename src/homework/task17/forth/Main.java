package homework.task17.forth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(78);
        list.add(45);
        list.add(43);
        System.out.println("Первоначальный список: " + list);
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            Integer abc = iter.next();
            iter.set(abc + 1);
        }
        System.out.println("Измененный список: " + list);
    }
}
