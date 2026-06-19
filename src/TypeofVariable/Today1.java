package TypeofVariable;

public class Today1 {
    int a1=60;
    public static void m1(){
        Today1 t1=new Today1();
        System.out.println(t1.a1);
    }
    public void m2(){
        System.out.println(a1);
    }
    public static void main(){
        m1();
        Today1 t1=new Today1();
        t1.m2();
        System.out.println("----------------------------------");
        m1();
        System.out.println("----------------------------------");
        Today1 b1=new Today1();
        System.out.println(b1.a1);

    }
}
