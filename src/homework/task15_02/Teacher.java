package homework.task15_02;

public class Teacher implements Learn {
    public String type;
    public int age;

    public Teacher(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Teacher() {
    }

    public void theatr() {
        System.out.println("Teacher like going to theatre for fun");
    }

    @Override
    public void learn() {
        System.out.println(" Teacher " + this.type + ", " + this.age + " must giving knowledge every lesson");
    }

    @Override
    public void exam() {
        System.out.println("Teacher every examination will be angry and strong");
    }
}
