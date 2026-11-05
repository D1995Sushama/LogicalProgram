package Collection;

import java.util.Vector;

public class Ex1_vector {
    static void main(String[] args) {
        Vector vr=new Vector();
        vr.add("Nandkishor");
        vr.add("Sushama");
        vr.add(67.6f);
        vr.add(58);
        vr.add('D');
        vr.add(null);
        vr.add(" ");
        System.out.println(vr);
        System.out.println(vr.size());
        System.out.println(vr.isEmpty());
        System.out.println(vr.get(3));
        System.out.println(vr.remove(5));
        vr.add(78);
        vr.set(4,67);
        System.out.println(vr);
    }
}
