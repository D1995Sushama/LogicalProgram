package LogicalCoding;

public class ReverseNumber {
    static void main(String[] args) {
        int num=12324;
        int rev=0;
        int ld;
        while(num>0){
            ld=num%10;
            rev=rev*10+ld;
            num=num/10;
            System.out.println(rev);
        }
        System.out.println(rev);
    }
}
