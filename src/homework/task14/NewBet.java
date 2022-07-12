package homework.task14;

public class NewBet {
    private double stavka;

    @Override
    public String toString() {
        return "NewBet{" +
                "stavka='" + stavka + '\'' +
                ", risk='" + risk + '\'' +
                '}';
    }

    private double risk;

    public NewBet(double stavka, double risk) {
        this.stavka = stavka;
        this.risk = risk;
    }

    public NewBet() {
    }

    public double getStavka() {
        return stavka;
    }

    public void setStavka(double stavka) {
        this.stavka = stavka;
    }

    public double getRisk() {
        return risk;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }
}
