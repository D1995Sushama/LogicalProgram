package TypeofVariable;

public class Saturday1 {
    int n1=70;
    public static void m1(){
       Saturday1 s1=new Saturday1();
       System.out.println(s1.n1);
    }
    public void m3(){
        System.out.println(n1);

    }
    public static void main(){
        System.out.println("nonstatic variable call in main method same class");
        Saturday1 s2=new Saturday1();
        System.out.println(s2.n1);
        System.out.println("nonstatic variable call in nonstatic method in same class main method");
        Saturday1 s3=new Saturday1();
        s3.m3();
        System.out.println("non static variable in static method");
        m1();
    }
}
