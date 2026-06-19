package TypeofVariable;

public class Todaystatvari {
    static int a1=60;
    public static void m1(){
        System.out.println(a1);
    }
    public void m2(){
        System.out.println(a1);
    }
    public static void main(){
        Todaystatvari t1=new Todaystatvari();
        t1.m2();
        System.out.println("-------------");
        m1();
        System.out.println("-------------");
        System.out.println(a1);
    }
}
