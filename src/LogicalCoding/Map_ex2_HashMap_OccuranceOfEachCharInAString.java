package LogicalCoding;

import java.util.HashMap;
import java.util.Set;

public class Map_ex2_HashMap_OccuranceOfEachCharInAString {
    static void main(String[] args) {
        String sr="abcaba";

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<=sr.length()-1;i++){
            char ch=sr.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        Set<Character> allcharacter=hm.keySet();
        for(Character key:allcharacter){
            if(hm.get(key)==1){
                System.out.println(key+"-"+hm.get(key));
            }
            System.out.println("----------------------------");
            for(Character key1:allcharacter){
                if(hm.get(key1)>1){
                    System.out.println(key1+"-"+hm.get(key1));
                }
            }
        }
    }
}
