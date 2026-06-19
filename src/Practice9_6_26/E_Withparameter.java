package Practice9_6_26;

public class E_Withparameter {
    public static void main(String[]args){
        addition(20,35);
        System.out.println("------------------------------");
        multiplication(20,25);

    }
    static void addition(int a,int b){
        int sum= a+b;
        System.out.println(sum);
    }
    static void multiplication(int a,int b){
        int mul=a*b;
        System.out.println(mul);
    }
}
