package homework.task16_02;

import homework.task16_02.Hospital.Doctor.Doctor;
import homework.task16_02.Hospital.Hospital;

public class Test1 {
    public static void main(String[] args) {
        Hospital number1 = new Hospital();
        Hospital number2 = new Hospital();
        Doctor doctor1 = new Doctor();
        Doctor doctor2 = new Doctor();
        doctor1.name = "Oleg";
        doctor2.setAge(18);
        doctor1.getExpierence(15);
        number1.doctors = 154;
        // number2.cabinet = 15; Переменная protected, поэтому не задается за пределами пакета и наследника
        number2.setType("Хирургия"); // переменная private, можно задать с помощью сеттеров
        number1.setType("Стоматология");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println("Чума 21 века: " + Doctor.SICKNESS);
    }
}
