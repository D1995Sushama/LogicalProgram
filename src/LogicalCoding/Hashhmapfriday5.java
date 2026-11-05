package LogicalCoding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Set;

public class Hashhmapfriday5 {
    private static final Logger log = LoggerFactory.getLogger(Hashhmapfriday5.class);

    public static void main(String[]args){
        String sr="my name is my name is susha";
        String[]srt=sr.split(" ");
        HashMap<String,Integer>hm=new HashMap();
        for(int i=0;i<=srt.length-1;i++){
            String s1=srt[i];
            if (hm.containsKey(s1)) {
                hm.put(s1,hm.get(s1)+1);
            }
            else{
                hm.put(s1,1);
            }
        }
        System.out.println("-------------------------");
       Set<String> allkey=hm.keySet();
        for(String key:allkey){
            System.out.println(key+"-"+hm.get(key));
        }
        System.out.println("-------------------------");
        for(String key:allkey){
            if(hm.get(key)==1){
                System.out.println(key+"-"+hm.get(key));
            }
        }
        System.out.println("-------------------------");
        for(String key:allkey){
            if(hm.get(key)>=1){
                System.out.println(key+"-"+hm.get(key));
            }
        }
    }
}
