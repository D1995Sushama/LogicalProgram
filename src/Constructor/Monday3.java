package Constructor;

public class Monday3 {
    int a;
    int b;
    Monday3(int num1,int num2){
        a=num1;
        b=num2;
    }
    public void mul(){
        System.out.println(a*b);
    }
    public void div(){
        System.out.println(a/b);
    }
    public static void main(String[]args){
        Monday3 m3=new Monday3(30,15);
        m3.div();
        Monday3 m1=new Monday3(70,28);
        m1.mul();
    }
}
