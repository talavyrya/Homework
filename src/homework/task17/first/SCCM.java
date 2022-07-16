package homework.task17.first;

public class SCCM extends Profession {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SCCM(String type, int salary, int age) {
        super(type, salary);
        this.age = age;
    }

    public SCCM(String type, int salary) {
        super(type, salary);
    }

    public SCCM() {
    }

    public void work() {
        System.out.println("Организовывает работу всей бригады и следит за кабиной пилотов");
    }

    public void vacation() {
        System.out.println("На расслабоне, на чиле");
    }
}
