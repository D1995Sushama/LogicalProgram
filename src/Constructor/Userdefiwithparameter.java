package Constructor;

public class Userdefiwithparameter {
    int a;
    int b;
    Userdefiwithparameter(int num1,int num2){
        a=num1;
        b=num2;
    }
    public void add() {
        System.out.println("Sum of Two Number Is="+(a+b));

    }
    public void sub(){
        System.out.println("Substraction of Two Number Is="+(a-b));
    }
    public void mul(){
        System.out.println("Multiplication Of Two Number="+(a*b));
    }
    public static void main(String[]args){
        System.out.println("Userdefined with parameter in same class--------------------------------");
        Userdefiwithparameter u1=new Userdefiwithparameter(8,9);
        u1.add();
        u1.sub();
        u1.mul();
        Userdefiwithparameter u2=new Userdefiwithparameter(20,58);
        u2.add();
        u2.sub();
        u2.mul();
        System.out.println("user defined with parameter different class----------------------------");
        Userdefinwithpara u3=new Userdefinwithpara(20,10);
        u3.add();
        u3.sub();
        Userdefinwithpara u4=new Userdefinwithpara(90,10);
        u4.sub();
        u4.add();

    }
}
