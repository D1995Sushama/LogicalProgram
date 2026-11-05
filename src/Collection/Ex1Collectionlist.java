package Collection;

import org.bouncycastle.util.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1Collectionlist {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add("Nandkishore");
        ar.add(5.50f);
        ar.add('O');
        ar.add(55);
        ar.add("niku");
        ar.add("niku");
        System.out.println(ar);
        System.out.println(ar.size());//total element
        ar.set(2,'A');//replace
        System.out.println(ar);//list
        System.out.println(ar.isEmpty());//boolean
        System.out.println(ar.get(2));//place value
        //Add data in between arraylist  -> right shift operation
        ar.add(3,60);//add value in list
        System.out.println(ar);
        //remove data in between arraylist  -> left shift operation
        ar.remove(1);
        System.out.println(ar);
        System.out.println("----------For loop-----------");
        for(int i=0;i<=ar.size()-1;i++){
            System.out.println(ar.get(i));
        }
        System.out.println("----------For each loop-----------");
        for(Object s1:ar) {
            System.out.println(s1);
        }
            System.out.println("-----print data from arraylist Iterator cursor----");
        //copy all the data from arraylist object into Iterator object
        Iterator itr=ar.iterator();
        //2: get 1 by 1 by data from Iterator Object
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----print data from arraylist ListIterator cursor----");
            //1: copy all the data from arraylist object into ListIterator object
           ListIterator list=ar.listIterator();

            //2: get 1 by 1 by data from ListIterator Object
           while(list.hasNext()){
           System.out.println(list.next());
           }

        }
    }

