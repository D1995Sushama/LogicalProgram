package Collection;

import ExceptionHandling.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex3_collection {
    static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Sushama");
        a1.add(101);
        a1.add(98817327);
        a1.add(null);
        a1.add('A');
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.isEmpty());
        System.out.println(a1.get(3));
        a1.add(55);
        System.out.println(a1.size());
        System.out.println(a1);
        a1.set(2,202);
        System.out.println(a1.size());
        System.out.println(a1);
        a1.remove(4);
        System.out.println(a1);
        System.out.println(a1.size());
        for(int i=0;i<=a1.size()-1;i++){
            System.out.println(a1.get(i));
        }
        for(Object s1:a1){
            System.out.println(s1);
        }
       Iterator itr=a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
       ListIterator list=a1.listIterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }



    }
}
