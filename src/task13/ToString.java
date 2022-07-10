package task13;

public class ToString {
    private String type;
    private int cabin;
    private String engine;

    public String toString() {
        return type + "----" + cabin + " seats----" + engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCabin() {
        return cabin;
    }

    public void setCabin(int cabin) {
        this.cabin = cabin;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public ToString(String type, int cabin, String engine) {
        this.type = type;
        this.cabin = cabin;
        this.engine = engine;
    }

    public ToString() {
    }

    public static void main(String[] args) {
        ToString boeing = new ToString("b-737", 180, "Rolls roys");
        ToString airbus = new ToString("a-321", 218, "Ferrari");
        ToString embraer = new ToString("e-145", 48, "Rolls roys");
        ToString duglas = new ToString();

        System.out.println(boeing);
        System.out.println(airbus);
        System.out.println(embraer);
        System.out.println(duglas);
    }
}
