package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Ex1 {
    static void main(String[] args) {
        Vector vr=new Vector();
        vr.add("Nandkishor");
        vr.add("Sushama");
        vr.add(67.6f);
        vr.add(58);
        vr.add('D');
        vr.add(null);
        vr.add(" ");
        System.out.println(vr);
        System.out.println(vr.size());
        System.out.println(vr.isEmpty());
        System.out.println(vr.get(3));
        System.out.println(vr.remove(5));
        vr.add(78);
        vr.set(4,67);
        System.out.println(vr);
        System.out.println("----------Use for loop------------");
        for(int i=0;i<=vr.size()-1;i++){
            System.out.println(vr.get(i));
        }
        System.out.println("----------Use for each loop------------");
        for(Object s1:vr){
            System.out.println(s1);
        }
        System.out.println("----------Iterator------------");
        Iterator itr=vr.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------Listiterator------------");
        ListIterator list=vr.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("----------Enumeratio---------");
        Enumeration exp=vr.elements();
        while(exp.hasMoreElements()){
            System.out.println(exp.nextElement());
        }
    }
}
