package Collection;

import org.bouncycastle.util.Arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist_Ex1 {
    public static void main(String[]args){
        LinkedList l1=new LinkedList();
        l1.add("nandkishor");
        l1.add(122);
        l1.add('A');
        l1.add(55.3f);
        l1.add(5.5f);
        l1.add(null);
        l1.add(" ");
        l1.add("nandkishor");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(3));
        System.out.println(l1.remove(3));
        System.out.println("-------------------------------");
        System.out.println(l1);
        System.out.println("-------------------------------");
        l1.add(56);
        l1.set(4,"sush");
        System.out.println(l1);
        System.out.println("-------------for loop------------------");
        for(int i=1;i<=l1.size()-1;i++){
            System.out.println(l1.get(i));
        }
        System.out.println("-------------for each loop------------------");
        for(Object s1:l1){
            System.out.println(s1);
        }
        System.out.println("-------------list iterator---------------");
        ListIterator list=l1.listIterator();
           while(list.hasNext()){
            System.out.println(list.next());
        }
           Iterator itr=l1.iterator();
           while(itr.hasNext()){
               System.out.println(itr.next());
           }
        l1.clear();
        System.out.println(l1);
        System.out.println(l1.size());

    }
}
