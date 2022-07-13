package homework.task16_02.Hospital.Doctor;

import homework.task16_02.Hospital.Hospital;

public class Doctor extends Hospital {
    public final static String SICKNESS = "COVID-19";
    public String name;
    private int age;
    int expierence;
    protected String special;

    public Doctor() {
        special = "Абитуриент";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExpierence(int i) {
        return expierence;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", expierence=" + expierence +
                ", special='" + special + '\'' +
                '}';
    }

    public void setExpierence(int expierence) {
        this.expierence = expierence;
    }
}
