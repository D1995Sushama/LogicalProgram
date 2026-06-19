package TypeofVariable;

public class LocalGlobalidenty {

    int num1=30;
    public void m1(){
        int num2=10;
        System.out.println(num2);
        System.out.println(num1);
    }
    public void m2(){
        int num3=20;
        System.out.println(num3);
        System.out.println(num1);
    }
    public static void main(String[]args){
        LocalGlobalidenty l1=new LocalGlobalidenty();
        l1.m1();
        l1.m2();
    }
}
