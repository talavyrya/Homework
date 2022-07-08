package homework.task12;

public class Player2 extends Team {
    private String name;
    private int age;
    private String national;

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
        System.out.println(info() + " Like kick by head");
    }

    public String info() {
        return name + ", " + age + " Halfback";
    }

    public Player2(String name, int age, String national) {
        this.name = name;
        this.age = age;
        this.national = national;
    }
}