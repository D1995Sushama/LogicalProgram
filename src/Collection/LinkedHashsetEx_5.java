package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEx_5 {
    static void main(String[] args) {
        LinkedHashSet l1=new LinkedHashSet();
        l1.add("sushama");
        l1.add(12.5f);
        l1.add('A');
        l1.add(67);
        l1.add("sushama");
        l1.add(null);
        l1.add("");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains('A'));
        System.out.println(l1.isEmpty());
        System.out.println(l1);
        System.out.println("----------------------------");
        for(Object s1:l1){
            System.out.println(s1);
        }
        System.out.println("----------------------------");
        Iterator itr= l1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------------------");

        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        l1.clear();
        System.out.println(l1);
    }
}
