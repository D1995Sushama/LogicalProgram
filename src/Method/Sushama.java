package Method;

public class Sushama {
    static void main(String[] args) {
        System.out.println("family");
        m1();
        m2();
        Sushama s1=new Sushama();
        s1.m3();
        s1.m4();
        s1.m5();

    }

    static void m1() {
        System.out.println("Papa");
    }
    static void m2() {
        System.out.println("Mama");
    }

    void m3() {
        System.out.println("Sister");
    }

    void m4() {
        System.out.println("Brother");
    }

    void m5() {
        System.out.println("Myself");
    }
}
