package homework.task15;

public class Daughter extends Father {
    public Daughter(String name, int age, int height) {
        super(name, age, height);
    }

    public Daughter() {
    }

    @Override
    public void profession() {
        System.out.println("Dauther is-Cabin crew member");
    }

    @Override
    public void rest() {
        System.out.println("Daughter like tourism during the vacation");
    }

    public void married() {
        System.out.println("Daughter was married on 22 years old");
    }
}
