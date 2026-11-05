package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistEX_3 {
    static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.add("Sushama");
        l1.add(12.5);
        l1.add(56);
        l1.add('A');
        l1.add(null);
        l1.add("Sushama");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(3));
        System.out.println(l1.isEmpty());
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.contains("sushama"));
        System.out.println(l1.remove(3));
        System.out.println(l1);
        System.out.println("-------------------------------");
        Iterator itr= l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------------------------");
        ListIterator list= l1.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("---------------------------------");
        for(Object s1:l1){
            System.out.println(s1);
        }
        System.out.println("------------------------------");
        for(int i=0;i<=l1.size()-1;i++){
            System.out.println(l1.get(i));
        }
    }
}
