package LogicalCoding;

import java.util.HashMap;
import java.util.Set;

public class Ex13_HashMap_OccurrenceOfEachStringInAStatement {
    static void main(String[] args) {
        String sr="my name is abc is abc is";
        String []srt=sr.split(" ");// [my(0) name(1) is(2) abc(3) is(4) abc(5) is(6)]
        HashMap<String,Integer>hm=new HashMap();
        //String(K),  Integer(V)
        // my            1
        // name          1
        // is            1+1=2+1=3
        // abc           1+1=2
      //    6<=6
        for(int i=0;i<=srt.length-1;i++) {
            String s1 = srt[i];

            if (hm.containsKey(s1)) {
                hm.put(s1, hm.get(s1) + 1);// is , 1+1=2+1=3
            } else {
                hm.put(s1, 1);
            }
        }
        System.out.println("----------------------");
            Set<String> allkey=hm.keySet();
            //1: Occurrence of each word in a statement
            for(String key:allkey){
                System.out.println(key+" "+hm.get(key));
            }
        System.out.println("---------------------");
            // print duplicate words in a statement/para
            for(String key:allkey) {
                if (hm.get(key) == 1) {
                    System.out.println(key + "-" + hm.get(key));
                }
            }
        System.out.println("-------");
        for(String key:allkey){
                if(hm.get(key)>1){
                    System.out.println(key+"-"+hm.get(key));
                }
            }
        }


}
