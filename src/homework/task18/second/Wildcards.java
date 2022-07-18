package homework.task18.second;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public Wildcards() {
    }

    public static void main(String[] args) {
        List<Wild> alWilds = new ArrayList();
        alWilds.add(new Wild(5));
        alWilds.add(new Wild(8));
        alWilds.add(new Wild(10));
        System.out.println(alWilds);
        List<Homeness> home = new ArrayList();
        home.add(new Homeness());
        home.add(new Homeness());
        home.add(new Homeness());
        test(alWilds);
        test(home);
    }

    private static void test(List<? extends Wild> odichal) {
        for (Wild dikiy : odichal) {
            dikiy.hunt();
            dikiy.cook();
        }
    }
}