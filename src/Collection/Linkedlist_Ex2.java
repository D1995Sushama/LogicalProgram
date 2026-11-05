package Collection;

import Method.Nandkishor;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linkedlist_Ex2 {
    static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add("Sushama");
        list.add(12.5f);
        list.add(56);
        list.add('E');
        list.add(null);
        list.add(56);
        list.add("Nandkishor");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(4));
        System.out.println("-------------------------");
        System.out.println(list.remove(null));
        System.out.println(list);
        System.out.println(list.contains(null));
        list.set(0,"nandu");
        System.out.println("-------------------------");
        for(Object s1:list){
            System.out.println(s1);
        }
        System.out.println("-------------------------");
        for(int i=0;i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");
        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
