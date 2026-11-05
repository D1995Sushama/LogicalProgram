package LogicalCoding;

public class ReversString {
    static void main(String[] args) {
        String org="Sushama";
        String rev="";
        int s=org.length()-1;
        for(int i=s;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        System.out.println("Orignam Number="+org);
        System.out.println("Reversed Number="+ rev);
    }
}
