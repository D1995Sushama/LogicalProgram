package Method;

public class Sample5 {
    static void main(String[] args) {
        System.out.println("Non static with same class");
        Sample5 S5=new Sample5();
        S5.m1();
        S5.m2();
        S5.m3();
    }

    void m1() {
        System.out.println("Non static1");
    }

    void m2() {
        System.out.println("Non static2");
    }

    void m3() {
        System.out.println("Non static3");
    }
}
