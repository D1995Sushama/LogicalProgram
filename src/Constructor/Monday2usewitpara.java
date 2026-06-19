package Constructor;

public class Monday2usewitpara {
    int a;
    int b;
    Monday2usewitpara(int num1, int num2){
        a = num1;
        b = num2;
    }
    public void add(){
        System.out.println("Addition of Two Number Is="+(a+b));
    }
    public void sub(){
        System.out.println("Substraction Of Two Number Is="+(a-b));
    }
    public static void main(String[]args){
        System.out.println("User Defined With Parameter");
        Monday2usewitpara m2=new Monday2usewitpara(23,58);
        m2.add();
        m2.sub();
    }
}
