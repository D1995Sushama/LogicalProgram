package LogicalCoding;

import DataType.Char;

import java.util.HashMap;
import java.util.Set;

public class HashMapfrichar1 {
    static void main(String[] args) {
        String sr="acvdsacvfsdabsd";
        HashMap<Character,Integer> hm=new HashMap();
        for(int i=0;i<=sr.length()-1;i++){
            char s1=sr.charAt(i);
            if(hm.containsKey(s1)){
                hm.put(s1,hm.get(s1)+1);
            }
            else{
                hm.put(s1,1);
            }
        }
        Set<Character>allkey=hm.keySet();
        for(Character ch :allkey){
            System.out.println(ch+"-"+hm.get(ch));
        }
        System.out.println("-------------------------");
        for(Character ch:allkey){
            if(hm.get(ch)>1){
                System.out.println(ch+"-"+hm.get(ch));
            }
        }
        System.out.println("-------------------------");
        for(Character ch:allkey){
            if(hm.get(ch)==1){
                System.out.println(ch+"-"+hm.get(ch));
            }
        }
    }
}
