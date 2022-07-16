package homework.task17.second;

public class Convert {
    public static void main(String[] args) {
        byte b = (byte) 128;
        System.out.println(b);
        int i = b;
        System.out.println(i);
        double d = 125.48;
        float f = (float) d;
        System.out.println(f);
        float ff = 123.4f;
        byte bb = (byte) ff;
        System.out.println(bb);
        float fff = b;
        System.out.println(fff);
        int ii = 113;
        char ch = (char) ii;
        System.out.println(ch);
        char ch2 = 'f';
        float ffff = ch2;
        System.out.println(ffff);
        String str = "Di ma";
        String[] str2 = str.split(" ");
        // int a = (int)str;  // String cannot be converted to int
        // char ch3 = (char)str; // String cannot be converted to char
        long l = ch2;
        System.out.println(l);
        char ch3 = (char) l;
        System.out.println(ch3);
    }
}
