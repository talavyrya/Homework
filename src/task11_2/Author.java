package task11_2;

class Author extends Book{
    private String shevchenko;

    @Override
    public String toString() {
        return "Author{" +
                "shevchenko='" + shevchenko + '\'' +
                '}';
    }

    public String getShevchenko() {
        return shevchenko;
    }

    public void setShevchenko(String shevchenko) {
        this.shevchenko = shevchenko;
    }

    static void show(){
        System.out.println("Тарас Григорович Шевченко");
    }
}