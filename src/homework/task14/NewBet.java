package homework.task14;

public class NewBet {
    private String stavka;

    @Override
    public String toString() {
        return "NewBet{" +
                "stavka='" + stavka + '\'' +
                ", risk='" + risk + '\'' +
                '}';
    }

    private String risk;

    public NewBet(String stavka, String risk) {
        this.stavka = stavka;
        this.risk = risk;
    }

    public NewBet() {
    }

    public String getStavka() {
        return stavka;
    }

    public void setStavka(String stavka) {
        this.stavka = stavka;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }
}
