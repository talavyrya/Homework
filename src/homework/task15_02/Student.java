package homework.task15_02;

public class Student implements Learn {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public void playing() {
        System.out.println("Student like playing football");
    }

    @Override
    public void learn() {
        System.out.println("Student " + this.name + " must learning every lesson");
    }

    @Override
    public void exam() {
        System.out.println("Every examination student very nervous");
    }
}
