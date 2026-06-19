package Constructor;

public class Userdefinwithpara {
    int a;
    int b;
    Userdefinwithpara(int num1,int num2){
        a=num1;
        b=num2;
    }
    public void add(){
        System.out.println("Addition of two number is="+(a+b));
    }
    public void sub(){
        System.out.println("Substraction of two number is="+(a-b));
    }
}
