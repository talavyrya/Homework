package univer;

public class Student {
    private int id;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    private String name;
    private String date;
    private String email;
    private String adress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Student() {
        this.name = "Homeless";
        this.email = "homeless@very.sick";
    }

    public Student(int id) {
        this();

    }

    public Student(int id, String name) {
        this.id = 245;
        this.name = "GARIK";
    }

    public Student(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = "24.02.2022";
    }

    public Student(int id, String name, String date, String email) {
        this(id, name);
        this.date = date;
        this.email = email;

    }

    public Student(int id, String name, String date, String email, String adress) {
        this(id, name, date);
        this.email = email;
        this.adress = adress;
    }
}

class Main {
    public static void main(String[] args) {
        Student one = new Student(1049, "Dmytro");
        Student two = new Student();
        Student three = new Student(1045, "Denys", "25.12.1987", "denys@gmail.com", "Dnipro city");
        Student four = new Student(445, "Kate", "04.05.1985", "kate winslett@ukr.net");
        Student five = new Student(159, "Serg", "24.12.1986", "www@gmail.com");
        Student six = new Student(1478, "Гарик", "01.01.2012");
        Student seven = new Student(1654);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
    }
}