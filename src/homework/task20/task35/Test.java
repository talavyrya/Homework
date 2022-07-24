package homework.task20.task35;

interface Anonim {
    void eat();
}

public class Test {
    public static void main(String[] args) {
        Anonim object = () -> System.out.println("All people want eating");
        object.eat();
    }
}
