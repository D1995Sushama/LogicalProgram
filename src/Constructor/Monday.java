package Constructor;

public class Monday {

    public void m2(){
        int a=2;
        int b=7;
        System.out.println("Addition Of Two Number Is="+(a+b));
    }
    public void m3(){
        int a=5;
        int b=6;
        System.out.println("Multiplication of Number Is="+(a*b));
    }
    public static void main(String[]args){
        Monday m1=new Monday();
        m1.m2();
        m1.m3();
        System.out.println("Different Class------------------------");
        Sunday s1=new Sunday();
        s1.m2();
        Sunday.m1();
    }
}
