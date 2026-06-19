package TypeofVariable;

public class NonStaticGlobal {
    int n1=20;
    public void m1(){
        System.out.println(n1);
    }
    public static void m2(){
        NonStaticGlobal s1=new NonStaticGlobal();
        System.out.println(s1.n1);
    }
    public static void main(String[]args){
       NonStaticGlobal s2=new NonStaticGlobal();
       System.out.println(s2.n1);
       System.out.println("-----------------------");
       Sample1 a1=new Sample1();
       System.out.println(a1.n2);
       Todaya a2=new Todaya();
       System.out.println(a2.n1);
    }
}
