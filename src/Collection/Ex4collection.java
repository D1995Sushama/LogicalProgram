package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex4collection {
    static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Reshma");
        a1.add(122);
        a1.add('A');
        a1.add(55.4f);
        a1.add(null);
        a1.add(" ");
        a1.add(122);
        System.out.println(a1);
        System.out.println(a1.size());
        System.out.println(a1.get(3));
        System.out.println(a1.isEmpty());
        a1.add(66);
        System.out.println(a1);
        a1.set(3,45.5);
        System.out.println(a1);
        a1.remove(5);
        System.out.println(a1);
        System.out.println("----------------");
        for(int i=0;i<=a1.size()-1;i++){
            System.out.println(a1.get(i));
        }
        System.out.println("----------------");
        for(Object s1:a1){
            System.out.println(s1);
        }
        System.out.println("----------------");
        Iterator itr= a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------");
        ListIterator list=a1.listIterator();
        while (list.hasNext()){
            System.out.println(list.next());
        }
    }
}
