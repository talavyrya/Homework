package homework.task17.third;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add(0, "Dog");
        animals.add(1, "Cat");
        animals.add(2, "Horse");
        animals.add(3, "Elephant");
        animals.add(4, "Giraff");
        animals.add(5, "Cow");
        animals.add(6, "Rabbit");
        animals.add(7, "Mouse");
        System.out.println(("Первоначальный полный список: " + animals));
        // Четвертое задание в дополнение к тертьему, удаление элементов из списка
        animals.remove(6);
        animals.remove(4);
        animals.remove(2);
        System.out.println("Новый список после удаления элементов: " + animals);
        System.out.println("Размер списка после удаления элементов: " + animals.size() + " Элементов");
    }
}
