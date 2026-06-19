package Method;

public class Nestedposi {
    public static void main(String[]args){
        int a=4;
        int b=-5;
        if(a%2==0){
            System.out.println("Even Number Is="+a);
            if(a>=0)
                System.out.println("Positive Number Is="+a);
            if(a<=0)
                System.out.println("Negative Number Is="+a);
        }
        else{
            System.out.println("Odd Number Is="+a);
        }
        if(b%2!=0){
            System.out.println("Odd Number Is="+b);
            if(b>=0)
                System.out.println("Positive Number Is="+b);
            if(b<=0)
                System.out.println("Negative Number Is="+b);
        }
        else{
            System.out.println("Even Number Is="+b);
        }

    }
}
