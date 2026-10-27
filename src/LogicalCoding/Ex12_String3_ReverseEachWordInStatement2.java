package LogicalCoding;

public class Ex12_String3_ReverseEachWordInStatement2 {
    static void main(String[] args) {
        String s1="my name is sushama";
        String[]ar=s1.split("");
        for(int i=0;i<=ar.length-1;i++){
            String org=ar[i];
            System.out.print(reverseString(org)+"");

        }

    }
    public static String reverseString(String org){
        String rev="";
        for(int j=org.length()-1;j>=0;j--){
            rev=rev+org.charAt(j);
        }
        return rev;
    }
}
