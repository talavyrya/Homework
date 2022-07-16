package homework.task17.first;

public class Test {
    public static void main(String[] args) {
        SCCM Talavyrya = new SCCM("Senior cabin crew", 20000);
        SCCM Makarenko = new SCCM("Senior Cabin crew", 18000);
        SCCM Kistruga = new SCCM("Senior CCM", 18500, 35);
        CCM Chorniy = new CCM("Cabin crew", 15000);
        CCM Ivanov = new CCM("Cabin Crew junior", 12000);
        Profession steward = new Profession("Boeing", 15000);
        Profession javaDeveloper = new Profession();
        Profession instructor = new SCCM();
        Profession junior = new CCM();
        System.out.print(Kistruga + "\t\t\t\t");
        Kistruga.work();
        System.out.print(Ivanov + "\t\t\t\t");
        Ivanov.work();
        System.out.print(steward + "\t\t\t\t");
        steward.work();
        System.out.print(instructor + "\t\t\t\t");
        instructor.vacation();
        junior.work();
        junior.vacation();
        total(Chorniy);
        total(Talavyrya);
        total(instructor);
        total(junior);
    }

    public static void total(Profession test) {
        test.work();
    }

}
