package LogicalCoding;

public class Ex12_String10_SeperateNumbersFromString2 {
    static void main(String[] args) {
        String str="a2bc3dd7f";
        String s2="";
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);

            if(Character.isDigit(ch)){
                s2=s2+ch;
            }
        }
        System.out.println(s2);
       int num=Integer.parseInt(s2);
        System.out.println(num+6);
    }
}
