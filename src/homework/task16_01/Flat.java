package homework.task16_01;

public class Flat {
    private int rooms;

    @Override
    public String toString() {
        return "Flat{" +
                "rooms=" + rooms +
                ", price=" + price +
                '}';
    }

    private int price;

    public Flat(int rooms, int price) {
        this.rooms = rooms;
        this.price = price;
    }

    public Flat() {
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void report(){
        System.out.println("Продам квартиру 30 тысяс долларов, 3 комнаты");
    }
}
