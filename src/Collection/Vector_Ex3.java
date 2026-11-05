package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorList {
    public static void main(String[]args){
        Vector v1=new Vector();
        v1.add("Sushama");
        v1.add(101);
        v1.add('A');
        v1.add(5.55f);
        v1.add(60);
        v1.add(null);
        v1.add("");
        v1.add("sushama");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.get(4));
        v1.add(123);
        System.out.println(v1);
        System.out.println("----------Use for loop------------");
        for(int i=0;i<=v1.size()-1;i++){
            System.out.println(v1.get(i));
        }
        v1.set(3,56.8f);
        System.out.println(v1);
        v1.remove(6);
        System.out.println(v1);

        System.out.println(v1.contains(60));
        System.out.println(v1.isEmpty());
        System.out.println("----------Use for loop------------");
        for(int j=0;j<=v1.size()-1;j++){
            System.out.println(v1.get(j));
        }
        System.out.println("----------Use for each loop------------");
        for(Object s1:v1){
            System.out.println(s1);
        }
        System.out.println("----------Iterator------------");
        Iterator itr=v1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----------Listiterator------------");
        ListIterator list=v1.listIterator();
        while(list.hasNext()){
            System.out.println(list.next());
        }
        System.out.println("----------Enumeration------");
        Enumeration enr=v1.elements();
        while(enr.hasMoreElements() ){
            System.out.println(enr.nextElement());
        }
    }
}
