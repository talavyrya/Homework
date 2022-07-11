package homework.task14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (true) {
            System.out.println("Введите ставку и риск ставки через пробел: ");
            String arr = input.nextLine();
            String bet[] = arr.split(" ");
            String stavka = bet[0];
            String risk = bet[1];
            NewBet stavka1 = new NewBet(stavka, risk);
            if ("q".equals(stavka) || ("q".equals(risk))) {
                break;
            }
            Database.bets[i] = stavka1;
            i++;
        }
        NewBet[] newArray = Arrays.copyOf(Database.bets, i);
        for (int j = 0; j < newArray.length; j++) {
            System.out.println(newArray[j]);
        }
    }
}
