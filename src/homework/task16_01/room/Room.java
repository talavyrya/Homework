package homework.task16_01.room;

import homework.task16_01.Flat;

public class Room extends Flat{
    private int table;

    @Override
    public String toString() {
        return "Room{" +
                "table=" + table +
                ", floor='" + floor + '\'' +
                '}';
    }

    private String floor;

    public Room(int table, String floor) {
        this.table = table;
        this.floor = floor;
    }

    public Room() {
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }
    public void report(){
        System.out.println("Ремонт комнат недорого!");
    }
}
