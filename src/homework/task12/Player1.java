package homework.task12;

public class Player1 extends Team {
    String name;
    int age;
    String national;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void play() {
        System.out.println(info() + " Like kick by foot. He winner everywhere!!!");
    }

    public String info() {
        return name + ", " + age + " Forward";
    }

    public Player1(String name, int age, String national) {
        this.name = name;
        this.age = age;
        this.national = national;
    }
}