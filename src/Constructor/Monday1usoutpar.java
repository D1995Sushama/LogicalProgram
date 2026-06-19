package Constructor;

public class Monday1usoutpar {
    int a;
    int b;
    Monday1usoutpar(){
        a=34;
        b=70;
    }
    public void add(){
        System.out.println("Addition Of Two Number Is="+(a+b));
    }
    public void mul(){
        System.out.println("Multiplication Of Two Number Is="+(a*b));
    }
    public static void main(String[]args){
        System.out.println("User Defined Without Parameter");
        Monday1usoutpar m1=new Monday1usoutpar();
        m1.add();
        m1.mul();
    }
}
