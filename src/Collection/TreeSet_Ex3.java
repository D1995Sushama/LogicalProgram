package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Ex3{
    static void main(String[] args) {
        TreeSet t1=new TreeSet();
        t1.add(125);
        t1.add(225);
        t1.add(576);
        t1.add(676);
        t1.add(625);
        t1.add(144);
        System.out.println(t1);
        System.out.println(t1.size());
        System.out.println(t1.isEmpty());
        System.out.println("----------------------");
        for(Object s1:t1){
            System.out.println(s1);
        }
        System.out.println("-----------------------------");
        Iterator itr= t1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        t1.pollFirst();
        System.out.println(t1);
        System.out.println("------------------------");
        t1.pollLast();
        System.out.println(t1);
        System.out.println("---------------------------");
        System.out.println(t1.last());
        System.out.println(t1.first());
        t1.clear();
        System.out.println("-------------------------------");
        System.out.println(t1.size());

    }
}
