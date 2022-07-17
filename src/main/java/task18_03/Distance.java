package task18_03;

public class Distance {
    public static double distance;

    public static void print() {
        System.out.println(distance + " километров, равно:  " + Converter.kiloMetr() + " метров");
        System.out.println(distance + " метров, равно: " + Converter.metrSm() + " cм.");
        System.out.println(distance + " сухопутных миль, равно: " + Converter.milyaKilometr() + " километров");
    }
    public static class Converter {

        public static double kiloMetr() {
            double res = distance * 1000;
            return res;
        }

        public static double metrSm() {
            double res = distance * 100;
            return res;
        }

        public static double milyaKilometr() {
            double res = distance * 1.609;
            return res;
        }
    }
}
