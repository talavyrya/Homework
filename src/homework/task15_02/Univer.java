package homework.task15_02;

public class Univer {
    public static void main(String[] args) {
        Student Klimenko = new Student("Ivan", 16);
        Teacher Sklyar = new Teacher("Law", 55);
        Student Ivanov = new Student();
        Learn Talavyrya = new Student(" Dmytro", 34);
        Learn Filonova = new Teacher("English", 58);
        Klimenko.learn();
        Sklyar.learn();
        Klimenko.playing();
        Sklyar.theatr();
        outputInfo(Ivanov);
        outputInfo(Talavyrya);
        outputInfo(Filonova);
        System.out.println("---------------------------------------------");
        System.out.println("Test second method of Interface");
        outputExam(Talavyrya);
        outputExam(Filonova);
    }

    public static void outputInfo(Learn info) {
        info.learn();
    }

    public static void outputExam(Learn examination) {
        examination.exam();
    }
}

