package alisherov;

public class Alisher20 {
    public static void main(String[] args) {
        Animals cat1 = new Animals("Marsik", 1, true);
        Animals cat2 = new Animals();
        Animals cat3 = new Animals("Myrka", 5, true);
        Animals dog1 = new Animals();
        Animals dog2 = new Animals("Reks", 5, true);
        Animals dog3 = new Animals("Doggi", 10, true);
        Animals dog4 = new Animals("Полкан", 6, true);
        Animals rabbit = new Animals();
        Animals rabbit2 = new Animals();
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(rabbit);
        System.out.println(rabbit2);
    }
}

class Animals {
    private String name;

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", house=" + house +
                '}';
    }

    private int age;
    private boolean house;

    private static int count=0;

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

    public boolean isHouse() {
        return house;
    }

    public void setHouse(boolean house) {
        this.house = house;
    }
    public Animals(String name, int age, boolean house){
        this.name = name;
        this.age = age;
        this.house = house;
    }
    public Animals() {
        this.name = "Homeless";
        this.house = false;
        count++;
    }
}
