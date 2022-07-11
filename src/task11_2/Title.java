package task11_2;

class Title extends Book{
    private String kobzar;

    @Override
    public String toString() {
        return "Title{" +
                "kobzar='" + kobzar + '\'' +
                '}';
    }

    public String getKobzar() {
        return kobzar;
    }

    public void setKobzar(String kobzar) {
        this.kobzar = kobzar;
    }

    static void show(){
        System.out.println("Обложка: Кобзар");
    }
}
