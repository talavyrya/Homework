package homework.task16_02.Hospital;

public class Hospital {
    private String type;

    @Override
    public String toString() {
        return "Hospital{" +
                "type='" + type + '\'' +
                ", cabinet=" + cabinet +
                ", doctors=" + doctors +
                '}';
    }

    protected int cabinet;
    public int doctors;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
