package Method;

public class Operation {
    static void main(String[] args) {
     addition(10,20);
     addition(30,20);
     addition(10,50);
     Mathop.sum(30,20);
     Mathop.sub(40,10);
     Mathop.mul(12,40);
     Mathop.div(30,5);
    }

    static void addition(int num1,int num2) {
        int sum=num1+num2;
        System.out.println(sum);
    }
}
