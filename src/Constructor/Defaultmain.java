package Constructor;

public class Defaultmain {
    public void m2(){
        System.out.println("running method is same class");
    }
    public static void main(){
        Defaultmain d1=new Defaultmain();
        d1.m2();
        System.out.println("------------------");
        Defaultcons d2=new Defaultcons();
        d2.m1();
    }
}
