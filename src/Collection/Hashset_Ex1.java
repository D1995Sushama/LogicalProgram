package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashset_Ex1 {
    static void main(String[] args) {
        HashSet s2=new HashSet();
        s2.add("Nandkishor");
        s2.add("Vaishnavi");
        s2.add("Akshya");
        s2.add(12.5f);
        s2.add('A');
        s2.add(null);
        s2.add(null);
        s2.add("Nandkishor");
        System.out.println(s2);
        System.out.println("----------------------");
        System.out.println(s2.size());
        System.out.println(s2.isEmpty());
        System.out.println(s2);
        System.out.println("----------------");
        s2.add(456);
        s2.remove(3);
        System.out.println(s2);
        System.out.println("-------for each loop---------");
        for(Object s1:s2){
            System.out.println(s1);
        }
        System.out.println("-------Iterator---------");
        Iterator itr = s2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        s2.clear();
        System.out.println(s2);
    }

}
