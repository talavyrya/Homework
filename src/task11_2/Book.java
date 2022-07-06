package task11_2;

public class Book {
    public static void main(String[] args) {
        Title face = new Title();
        Author sheva = new Author();
        Content virsh = new Content();
        face.setKobzar("KOBZAR");
        sheva.setShevchenko("Shevcnehko");
        virsh.setZapovit("ZAPOVIT");
        System.out.println(face.getKobzar());
        System.out.println(sheva.getShevchenko());
        System.out.println(virsh.getZapovit());
        face.show();
        sheva.show();
        virsh.show();
    }
}





