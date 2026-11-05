package Collection;

import java.util.ArrayList;

public class DefaultArrayList {
    static void main(String[] args) {
        ArrayList a1=new ArrayList(20);//initial/default capacity=10
        a1.add("Nandkishor");                      //initial capacity=20
        a1.add(101);
        a1.add('A');
        a1.add(55.5f);
        a1.add(null);
        a1.add(101);
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.isEmpty());
        System.out.println(a1.get(3));
        //update data
        a1.set(2,'E');
        System.out.println(a1);
    }
}
