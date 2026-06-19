package Method;

public class Addition {

    static void main(String[] args) {
        addition(12,13);
        addition(34,23);
        substraction(34,20);
        multiplication(12,20);
        division(25,5);
    }

    static void addition(int num1,int num2) {

       int sum=num1+num2;
        System.out.println("sum:"+sum);
    }

    static void substraction(int num1,int num2) {
        int sub=num1-num2;
        System.out.println("sub:"+sub);
    }

    static void multiplication(int num1,int num2) {
        int mul=num1*num2;
        System.out.println("mul:"+mul);
    }

    static void division(int num1,int num2) {
        int div=num1/num2;
        System.out.println("div:"+div);
    }
}
