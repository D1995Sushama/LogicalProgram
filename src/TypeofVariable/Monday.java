package TypeofVariable;

public class Monday {
    int a=20;
    public void m1(){
        System.out.println(a);
    }
    public static void m2(){
        Monday a1=new Monday();
        System.out.println( a1.a);
    }
    public static void main(String[]args){
        m2();
        Monday m3=new Monday();
        m3.m1();
    }
}
