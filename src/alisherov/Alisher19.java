package alisherov;

public class Alisher19 {
    public static void main(String[] args) {
        Weather rain = new Weather();
        Weather snow = new Weather();
        Weather sunshine = new Weather();
        Weather rain2 = new Weather("25 of June", "��������� ������� ������");
        Weather snow2 = new Weather("25 of December", "This is snow, this is snow");
        rain.setPrognoz("Raining Day");
        rain.setTemperature(15.5);
        rain.setDate("01.07.2022");
        snow.weather();
        snow.setPrognoz("��������� ��������, ������ ����� �� 10�/�");
        snow.setTemperature(-15);
        snow.setDate("31.12.2021");
        sunshine.setDate("03.07.2022");
        sunshine.setTemperature(25);
        sunshine.setPrognoz("The sun is shining");
        System.out.println(sunshine);
        System.out.println(snow);
        System.out.println(rain);

    }
}

class Weather {
    private String prognoz;

    @Override
    public String toString() {
        return "Weather{" +
                "prognoz='" + prognoz + '\'' +
                ", temperature=" + temperature +
                ", date='" + date + '\'' +
                '}';
    }

    private double temperature;
    private String date;

    public String getPrognoze() {
        return prognoz;
    }

    public void setPrognoz(String prognoz) {
        this.prognoz = prognoz;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void weather() {
        System.out.println("���� ���� ���� ����, �������� � ������");
    }
    public Weather() {
    }
    public Weather(String date, String prognoz) {
        this.date = date;
        this.prognoz = prognoz;
    }
}
