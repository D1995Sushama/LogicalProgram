package Conditional;

public class Nestedifsmallernum {
    public static void main(String[]args){
        int a=5;
        int b=1;
        int c=6;
        if (a<b){
            if(a<c)
            System.out.println("Smallest Number Is=a");
        }
        if(b<a) {
            if (b<c)
                System.out.println("Smallest Number Is=b");
        }
        if(c<a){
            if(c<b)
            System.out.println("Smallest Number Is=c");
        }
    }
}
