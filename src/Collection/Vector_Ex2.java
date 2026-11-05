package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Ex2 {
    public static void main(String[]args){
        Vector vr=new Vector();
        vr.add("Nandkishor");
        vr.add(121);
        vr.add('A');
        vr.add(55.8f);
        vr.add(5.3f);
        vr.add(null);
        vr.add(" ");
        System.out.println(vr);
        System.out.println(vr.size());
        System.out.println(vr.get(4));
        System.out.println(vr.isEmpty());
        System.out.println("----------------------");
        System.out.println(vr);
        vr.add(66);
        System.out.println("----------------------");
        vr.set(3,"niku");
        System.out.println(vr);
        System.out.println("----------Use for loop------------");
        for(int i=1;i<=vr.size()-1;i++){
            System.out.println(vr);
        }
        System.out.println("----------Use for each loop------------");
        for(Object s1:vr){
            System.out.println(s1);
        }
        System.out.println("----------Iterator------------");
        Iterator itr=vr.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------listiterator------------");
        ListIterator list=vr.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("---------------------------");
        Enumeration enu= vr.elements();
        while(enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }

    }
}
