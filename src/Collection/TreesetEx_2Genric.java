package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx_2Genric{
    static void main(String[] args) {
        TreeSet<String> t1=new TreeSet<String>();
        t1.add("Nandu");
        t1.add("Sush");
        t1.add("Vaishu");
        t1.add("Akhi");
        t1.add("Vidya");
        t1.add("Nitu");
        System.out.println(t1);
        System.out.println(t1.size());
        System.out.println(t1.isEmpty());
        System.out.println("------------------------");
        Iterator itr=t1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------------------------");
        for(Object s1:t1){
            System.out.println(s1);
        }
        System.out.println("-----------------------");
        t1.pollLast();
        System.out.println(t1.first());
        t1.pollFirst();
        System.out.println(t1.last());


    }

}