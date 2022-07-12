package homework.task14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        String stop = "q";
        NewBet[] newArray = new NewBet[2];
        while (true) {
            System.out.println("Введите ставку и риск ставки через пробел: ");
            String arr = input.nextLine();
            String bet[] = arr.split(" ");
            if ((bet[0].equals(stop)) || (bet[1].equals(stop))) {
                newArray = Arrays.copyOf(newArray, i);
                break;
            }
            double stavka = Double.parseDouble(bet[0]);
            double risk = Double.parseDouble(bet[1]);
            NewBet stavka1 = new NewBet(stavka, risk);
            newArray[i] = stavka1;
            i++;
            newArray = Arrays.copyOf(newArray, i + 1);
        }
        System.out.println("Ваши ставки господа, глаз мой радуют всегда!!");
        for (int y = 0; y < newArray.length; y++) {
            System.out.println(newArray[y]);
        }
    }
}