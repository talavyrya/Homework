package homework.task15;

public class Complite {
    public static void main(String[] args) {
        Father Olexandr = new Father();
        Father Mykola = new Father("Mykola", 58, 174);
        Son Dmytro = new Son();
        Son Denis = new Son("Denis", 34, 184);
        Daughter Nataliia = new Daughter();
        Daughter Sofiia = new Daughter("Sofiia", 25, 170);
        Father Olexandr2 = new Son(); // создание объекта сына типа ОТЕЦ
        Dmytro.setName("Dmytro");
        Olexandr2.setName("Olexandr");
        Olexandr.setName("Olexander");
        Nataliia.setName("Nataliia");
        Nataliia.setAge(37);
        Nataliia.setHeight(170);
        System.out.println("Как сын любит отдыхать?");
        Dmytro.rest();
        System.out.println("Как отец любит отдыхать?");
        Olexandr2.rest(); // Выводится метод отдыха сына, так создается объект сын типа отца. Если бы у сына не было
        // такого метода, то использовался бы метод отца
        System.out.println("Как дочь любит отдыхать?");
        Nataliia.rest();
        System.out.println("Кем работает сын?");
        Dmytro.profession();
        System.out.println("Кем работал папа всю жизнь?");
        Olexandr.profession();
        System.out.println("Когда женился сын");
        Dmytro.married();
        System.out.println("Когда замуж вышла дочь?");
        Nataliia.married();
        System.out.println(Nataliia);
        System.out.println(Mykola);
        System.out.println(Denis);
    }
}
