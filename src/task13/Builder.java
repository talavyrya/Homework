package task13;

public class Builder {
    public static void main(String[] args) {
        StringBuilder stroka = new StringBuilder("Hello");
        stroka.append(" my friend.");
        stroka.append(" How are you?");
        stroka.append(" The weather is fine,").append(" sun is shining,").append(" temperature near + 35!!");
        System.out.println(stroka.toString());
        String name = "Dmytro";
        int age = 34;
        String email = "talavyrya@gmail.com";
        System.out.printf("My name is %1$s, I am %2$d years old, and my e-mail - %3$S \n", name, age, email);
        double vol1 = 34.52;
        double vol2 = 54.47;
        double proc = vol1 / vol2;
        System.out.printf("Коеффициент между двух чисел: %.2f \n", proc);
        System.out.printf("Длинна значения занимает 20 символов %20f \n", vol1);
    }
}
