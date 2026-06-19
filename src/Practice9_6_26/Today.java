package Practice9_6_26;

public class Today {
    public static void main(String[]args){
        m1();
        Today a1=new Today();
        a1.m2();
        System.out.println("----------------------------");
        System.out.println("Non Static Method Different Class");
        NewPro m1 = new NewPro();
        m1.m2();
        System.out.println("---------------------------------");
        System.out.println("Static Method In Same Class");
        NewPro.m1();
    }
    static void m1(){
        int a=6;
        int b=7;
        int add=a+b;
        System.out.println(add);
    }
    void m2(){
        int a=4;
        int b=5;
        int mul=a*b;
        System.out.println("Multipication of two Number="+mul);
    }
}
