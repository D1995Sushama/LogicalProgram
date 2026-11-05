package Map;

import java.util.Hashtable;

public class Map1_HashTable {
    static void main(String[] args) {
        Hashtable<Integer,String>ht=new Hashtable<>();
        ht.put(3,"nandkishor");
        ht.put(4,"Sushama");
        ht.put(2,"Shaman");
        ht.put(1,"Shaman");
       // ht.put(null,null);//Hashtable doesn't allow any null key or value.
        System.out.println(ht);

    }

}
