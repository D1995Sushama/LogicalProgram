package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex6_collection {
    static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("Nitiraj");
        a1.add(122);
        a1.add('D');
        a1.add(null);
        a1.add(122);
        System.out.println(a1);
        System.out.println(a1.get(3));
        System.out.println(a1.isEmpty());
        System.out.println(a1.size());
        a1.add("Reshma");
        System.out.println(a1);
        a1.set(4,"Sushama");
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
       Iterator itr=a1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------------");
        ListIterator list=a1.listIterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
}
