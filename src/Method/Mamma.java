package Method;

public class Mamma {
    static void main(String[] args) {
        System.out.println("Family");
        Family1.m1();
        Family1.m2();
        Family1.m3();
        Family1.m4();
        Family1.m5();
        Mamma M1=new Mamma();
        M1.m2();
        M1.m3();
        m1();
        Nstadmart n1=new Nstadmart();
        n1.m1();
        n1.m2();
        n1.m3();
    }

    static void m1() {
        System.out.println("Ninam Padali");
    }

    void m2() {
        System.out.println("Father");
    }

    void m3() {
        System.out.println("Mother");
    }
}
