package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEX_1 {
    static void main(String[] args) {
        LinkedHashSet s1=new LinkedHashSet();
        s1.add("Nandkishor");
        s1.add(124);
        s1.add(12.5f);
        s1.add('A');
        s1.add(55.5);
        s1.add(null);
        s1.add(124);
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.contains(124));
        s1.remove('A');
        System.out.println(s1);
        s1.add("sushama");
        System.out.println(s1);
        System.out.println("-------------For each loop------------------");
        for(Object s2:s1){
            System.out.println(s2);
        }
        System.out.println("--------------Iterator----------");
        Iterator itr = s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------------");
        s1.clear();
        System.out.println(s1);


    }
}
