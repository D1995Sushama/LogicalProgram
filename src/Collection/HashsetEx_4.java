package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    static void main(String[] args) {
       HashSet h1=new HashSet();
       h1.add("Sushama");
       h1.add(56);
       h1.add(12.5f);
       h1.add('A');
       h1.add(null);
       h1.add("Sushama");
       System.out.println(h1);
       System.out.println(h1.size());
       System.out.println(h1.contains('A'));
       System.out.println(h1.isEmpty());
        System.out.println(h1.remove(4));
        System.out.println(h1);
        System.out.println("--------------------");
        for(Object s1:h1) {
            System.out.println(s1);
        }
        Iterator itr= h1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        h1.clear();
        System.out.println(h1);
    }

}
