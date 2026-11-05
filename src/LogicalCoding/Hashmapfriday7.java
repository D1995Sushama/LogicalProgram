package LogicalCoding;

import java.util.HashMap;
import java.util.Set;

public class Hashmapfriday7 {
    public static void main(String[]args){
        String sr="my abs is name is my name is abs";
        String[]srt=sr.split(" ");
        HashMap<String,Integer>hm=new HashMap();
        for(int i=0;i<=srt.length-1;i++){
            String s1=srt[i];
            if(hm.containsKey(s1)){
                hm.put(s1,hm.get(s1)+1);
            }
            else{
                hm.put(s1,1);
            }
        }
        Set<String> allkey=hm.keySet();
        for(String key:allkey){
            System.out.println(key+"-"+hm.get(key));
        }
        System.out.println("-------------------------");
        for(String key:allkey){
            if(hm.get(key)>1) {
                System.out.println(key + "-" + hm.get(key));
            }
        }
        System.out.println("-------------------------");
        for(String key:allkey){
            if(hm.get(key)==1){
                System.out.println(key+"-"+hm.get(key));
            }
        }
    }
}
