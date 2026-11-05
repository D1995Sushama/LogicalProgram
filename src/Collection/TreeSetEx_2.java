package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx_2 {
    static void main(String[] args) {
        TreeSet t1=new TreeSet();
        t1.add("sushama");
        t1.add("nandu");
        t1.add("vidya");
        t1.add("vaishu");
        t1.add("sushama");
        t1.add("nandkishor");
        t1.add("reshma");
        System.out.println(t1);
        System.out.println(t1.size());
        t1.pollLast();
        System.out.println(t1);
        t1.pollFirst();
        System.out.println(t1);
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println("----------------------------");
        for (Object s1:t1){
            System.out.println(s1);
        }
        System.out.println("------------------------------");
        Iterator itr=t1.descendingIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
