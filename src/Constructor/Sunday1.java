package Constructor;

public class Sunday1 {
    int num1;
    int num2;
    public void m1(){

        System.out.println("Default Constructor");
    }
    public static void main(String[]args){
        Sunday1 s1=new Sunday1();
        s1.m1();
        System.out.println("Different class default constructor-------------------------------");
        Defaultcons d1=new Defaultcons();
        d1.m1();
    }
}
