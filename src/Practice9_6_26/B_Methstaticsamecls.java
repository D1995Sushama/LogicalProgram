package Practice9_6_26;

public class B_Methstaticsamecls {
    public static void main(String[]args){
        m1();
        m2();

    }
    static void m1(){
        int a=80;
        int b=20;
        int add=a+b;
        System.out.println("Addition of Number Is:"+add);
    }
    static void m2(){
        int a=4;
        int b=5;
        int mul=a*b;
        System.out.println("Multiplication Of Number Is:"+mul);

    }
}
