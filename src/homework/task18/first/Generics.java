package homework.task18.first;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List surname = new ArrayList();
        Work stolyar = new Work();
        Work slesar = new Work();
        surname.add("Talavyrya");
        surname.add("Ivanov");
        surname.add("Bagrov");
        surname.add("Seredyuk");
        surname.add(stolyar);
        String abcd = (String)surname.get(2); // Работает при преообразовании к String
        System.out.println(abcd);

        List<String> name = new ArrayList();
        name.add("Dmytro");
        name.add("Mykyta");
        name.add("Oleg");
        // name.add(stolyar); // Нельзя добавить объект класса Object в список String
        String superName = name.get(0);
        System.out.println(superName);
        System.out.println(stolyar);
    }
}
class Work {
    Work() {
    }
}