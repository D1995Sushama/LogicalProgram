package Map;

import java.util.HashMap;
import java.util.Set;

public class Map_ex1_HashMap {
    static void main(String[] args) {
     HashMap<Integer,String> hm = new HashMap<>();
     hm.put(101,"sushama");
     hm.put(1,"nandu");
     hm.put(2,"vaishu");
     hm.put(404,"sush");
     hm.put(null,null);
     System.out.println(hm);
        hm.put(404,"akhi");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.containsKey(2));
        System.out.println(hm.get(101));
        System.out.println("-------------------------");
          Set<Integer> allkeys=hm.keySet();
          for(Integer key:allkeys){
              System.out.println(key);
          }
          for(Integer key:allkeys){
              System.out.println(key+" "+hm.get(key));
          }


    }
}
