package Method;

public class Mulitipleinone {
    static void main(String[] args) {

        System.out.println("sample");
       m1();
       Mulitipleinone m1=new Mulitipleinone();
       m1.m2();
       Sample3.m1();
       Sample4 S4=new Sample4();
       S4.m1();
    }

    static void m1() {
        System.out.println("Static class with same class");
    }

    void m2() {
        System.out.println("Non static class with same class");
    }
}
