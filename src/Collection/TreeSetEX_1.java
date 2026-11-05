package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEX_1 {
    static void main(String[] args) {
        TreeSet s1=new TreeSet();
        s1.add("Nandkishor");
        s1.add("Vaishnavi");
        s1.add("Akshaya");
        s1.add("Reshma");
        //s1.add(null);//null not allowed
        //s1.add(null);
        s1.add("Nitiraj");
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        System.out.println(s1.contains("Nandkishor"));
        System.out.println("---------------------");
        s1.add("Sushama");
        System.out.println(s1);
        s1.remove("Reshma");
        System.out.println(s1);
        System.out.println("-------------------");
        System.out.println("-----------for each loop--------");
        for(Object s2:s1){
            System.out.println(s2);
        }
        System.out.println("-----------Iterator--------------");
       Iterator itr=s1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("--------remove first position data------------");
        s1.pollFirst();//remove first position data
        System.out.println(s1);
        System.out.println("-----------remove last position data--------------");
        s1.pollLast();//remove last position data
        System.out.println(s1);
        System.out.println(s1.first());//get first position value
        System.out.println(s1.last());//get last position value
        System.out.println("----------descending iterator-----------");
        Iterator itr1=s1.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }
}
