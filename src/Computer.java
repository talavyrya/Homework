import java.util.Arrays;

public class Computer {
    private double cpu;
    private double ram;

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public static void main(String[] args) {
        Computer[] compArray = new Computer[5];
        compArray[0] = new Computer();
        compArray[1] = new Computer();
        compArray[2] = new Computer();
        compArray[3] = new Computer();
        compArray[4] = new Computer();
        compArray[0].setCpu(3500.0);
        compArray[1].setCpu(4200.5);
        compArray[2].setCpu(3800.5);
        compArray[3].setCpu(3850.5);
        compArray[4].setCpu(3500.5);
        compArray[0].setRam(256);
        compArray[1].setRam(512);
        compArray[2].setRam(512);
        compArray[3].setRam(1024);
        compArray[4].setRam(2048);
        for (int i = 0; i < compArray.length; i++) {
            System.out.println("Частота CPU: " + compArray[i].getCpu() + " Mghz;" + "\t Объем оперативной памяти: " + compArray[i].getRam() + " Mb");
        }
    }
}
