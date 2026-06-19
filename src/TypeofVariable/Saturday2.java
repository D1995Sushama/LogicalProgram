package TypeofVariable;

public class Saturday2 {
    static int n1=80;
    public static void m1(){
        System.out.println(n1);
    }
    public void m2(){
        System.out.println(n1);
    }
    public static void main(){
        System.out.println(" Static Variable In Nonstatic Method Call In Main Method");
        Saturday2 s2=new Saturday2();
        s2.m2();
        System.out.println(" Static Variable In Static Method Call In Main Method");
        m1();
        System.out.println(" Static Variable Call In Main Method");
        System.out.println(n1);
    }
}
