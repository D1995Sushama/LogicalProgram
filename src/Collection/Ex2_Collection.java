package Collection;

import java.util.ArrayList;

public class Ex2_Collection {
    public static void main(String[]args){
        ArrayList ar=new ArrayList();
        ar.add("Sushama");
        ar.add('O');
        ar.add(5.5f);
        ar.add(55);
        ar.add("rupa");
        System.out.println(ar);
        System.out.println(ar.isEmpty());
        System.out.println(ar.get(3));
        System.out.println(ar.size());
        ar.add(3,60);
        System.out.println(ar);
        ar.set(2,5.7f);
    }
}
