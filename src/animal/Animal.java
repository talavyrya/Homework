package animal;

public class Animal {
    private int age;

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Animal slon = new Animal();
        Animal bars = new Animal(4);
        Animal jiraf = new Animal(6, "Longy");
        Animal dog = new Animal(4, "Polkan");
        Animal cat = new Animal(8);
        Animal horse = new Animal(10, "Pegas");
        slon.setAge(2);
        jiraf.setName("Pretty");
        System.out.println(slon);
        System.out.println(bars);
        System.out.println(dog);
        System.out.println(horse);
    }
}
