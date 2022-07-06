package homework;

import java.util.Scanner;

public class Bet {
    private double bet;
    private int risk;

    @Override
    public String toString() {
        return "Bet{" +
                "bet=" + bet +
                ", risk=" + risk +
                '}';
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public int getRisk() {
        return risk;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public Bet() {
    }

    public Bet(int risk, double bet) {
        this.risk = risk;
        this.bet = bet;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bet bet1 = new Bet(5, 1.85);
        Bet bet2 = new Bet(6, 2.10);
        Bet bet3 = new Bet(1, 1.15);
        Bet bet4 = new Bet(2, 1.30);
        Bet bet5 = new Bet();
        Bet bet6 = new Bet();
        Bet bet7 = new Bet();
        Bet bet8 = new Bet();
        System.out.println("Введите уровень риска ставки №5: ");
        bet5.setRisk(input.nextInt());
        System.out.println("Введите коеффициент ставки №5: ");
        bet5.setBet(input.nextDouble());
        System.out.println("Введите уровень риска ставки №6: ");
        bet6.setRisk(input.nextInt());
        System.out.println("Введите коеффициент ставки №6: ");
        bet6.setBet(input.nextDouble());
        System.out.println("Введите уровень риска ставки №7: ");
        bet7.setRisk(input.nextInt());
        System.out.println("Введите коеффициент ставки №7: ");
        bet7.setBet(input.nextDouble());
        System.out.println("Введите уровень риска ставки №8: ");
        bet8.setRisk(input.nextInt());
        System.out.println("Введите коеффициент ставки №8: ");
        bet8.setBet(input.nextDouble());
        System.out.println(bet1);
        System.out.println(bet2);
        System.out.println(bet3);
        System.out.println(bet4);
        System.out.println(bet5);
        System.out.println(bet6);
        System.out.println(bet7);
        System.out.println(bet8);
        input.close();
    }
}
