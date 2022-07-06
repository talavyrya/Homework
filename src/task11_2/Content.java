package task11_2;

class Content extends Book{
    private String zapovit;

    @Override
    public String toString() {
        return "Content{" +
                "zapovit='" + zapovit + '\'' +
                '}';
    }

    public String getZapovit() {
        return zapovit;
    }

    public void setZapovit(String zapovit) {
        this.zapovit = zapovit;
    }

    static void show(){
        System.out.println("як умру, то поховайте мене на могил≥....");
    }
}
