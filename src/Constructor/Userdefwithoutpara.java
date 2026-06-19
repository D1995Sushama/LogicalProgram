package Constructor;

public class Userdefwithoutpara {
    int num1;
    int num2;
    Userdefwithoutpara(){
        num1=10;
        num2=60;
    }
    public void add(){
        System.out.println("Addition of Two Number Is="+num1+num2);
    }
    public void mult(){
        System.out.println("Multiplication Of Number Is="+num1*num2);
    }
    public static void main(){
        Userdefwithoutpara u1=new Userdefwithoutpara();
        u1.add();
        u1.mult();
        System.out.println("------------------");
        Userdefined u2=new Userdefined();
        u2.div();
        u2.sub();

    }
}
