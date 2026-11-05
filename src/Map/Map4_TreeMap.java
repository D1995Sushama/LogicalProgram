package Map;

import java.util.TreeMap;

public class Map4_TreeMap {
    static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(1,null);
       // tm.put(null,null);
        tm.put(2,"nandkishor");
        tm.put(4,"sushama");
        tm.put(5,"vaishnavi");
        System.out.println(tm);
    }
}
