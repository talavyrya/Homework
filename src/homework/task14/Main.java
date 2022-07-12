package homework.task14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        NewBet[] newArray = new NewBet[2];
        int l = newArray.length;
        while (true) {
            System.out.println("Введите ставку и риск ставки через пробел: ");
            String arr = input.nextLine();
            String bet[] = arr.split(" ");
            String stavka = bet[0];
            String risk = bet[1];
            NewBet stavka1 = new NewBet(stavka, risk);
            if ("q".equals(stavka) || ("q".equals(risk))) {
                newArray = Arrays.copyOf(newArray, i);
                break;
            }
            newArray[i] = stavka1;
            i++;
            newArray = Arrays.copyOf(newArray, i + 1);
        }
        //   System.out.println(Arrays.toString(newArray));
        for (int y = 0; y < newArray.length; y++) {
            System.out.println(newArray[y]);
        }
    }
}
