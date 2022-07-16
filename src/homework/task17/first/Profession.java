package homework.task17.first;

public class Profession {
    protected String type;

    @Override
    public String toString() {
        return "Profession{" +
                "type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }

    protected int salary;

    public Profession(String type, int salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Profession() {
        this.type = "Airbus aircraft";
        this.salary = 15555;
    }

    public void work() {
        System.out.println("Любая профессия достойна уважения");
    }

    public void vacation() {
        System.out.println("Путешествует каждый год по сервисным билетам");
    }
}
