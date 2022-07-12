package homework.task15;

public class Son extends Father {
    public Son(String name, int age, int height) {
        super(name, age, height);
    }

    public Son() {
    }

    @Override
    public void profession() {
        System.out.println("Son is - Java developer");
    }

    @Override
    public void rest() {
        System.out.println("Son like walking in the city");
    }

    public void married() {
        System.out.println("Son was married on 25 years old");
    }
}
