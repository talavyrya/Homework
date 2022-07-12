package homework.task15;

public class Father {
    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    private String name;
    private int age;
    private int height;

    public Father(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Father() {
    }

    public void profession() {
        System.out.println("Father is fermer");
    }

    public void rest() {
        System.out.println("Father watching TV-set");
    }

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
