package Constructor;

public class Monday5 {
    int a;
    int b;
    Monday5(){
        a=56;
        b=68;
    }
    public void add(){
        System.out.println(a+b);
    }
    public void sub(){
        System.out.println(a*b);
    }
    public static void main(String[]args){
        System.out.println("User Defined without parameter constructor");
        Monday5 m5=new Monday5();
        m5.add();
        m5.sub();
    }
}
