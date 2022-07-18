package homework.task18.second;

public class Wild {
    private int age;

    public Wild() {
    }

    public Wild(int age) {
        this.age = age;
    }

    public String toString() {
        return String.valueOf(this.age);
    }

    public void hunt() {
        System.out.println("Hunter on the way");
    }

    public void cook() {
        System.out.println("\t\t\t\t\t\t\t Домашние готовят еду");
    }
}
