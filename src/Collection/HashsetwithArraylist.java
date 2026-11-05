package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetwithArraylist {
    static void main(String[] args) {
        ArrayList s1=new ArrayList();
        s1.add("Nandkishor");
        s1.add(5.05f);
        s1.add('A');
        s1.add(56);
        s1.add(null);
        s1.add(5.05f);
        s1.add('A');
        System.out.println(s1);
        System.out.println("-------------------------------");
        HashSet s2=new HashSet(s1);
        System.out.println(s2);
        System.out.println(s2.size());
        System.out.println(s2.isEmpty());

    }
}
