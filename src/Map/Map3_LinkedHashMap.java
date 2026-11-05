package Map;

import java.util.LinkedHashMap;

public class Map3_LinkedHashMap {
    static void main(String[] args) {
        LinkedHashMap<Integer,String> lm=new LinkedHashMap<>();
        lm.put(4,"Nandkishor");
        lm.put(2,"Sushama");
        lm.put(5,"Vaishnavi");
        lm.put(3,"Reshma");
        lm.put(1,null);
        lm.put(null,null);
        System.out.println(lm);
    }
}
