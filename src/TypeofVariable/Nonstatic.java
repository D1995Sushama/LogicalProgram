package TypeofVariable;

public class Nonstatic {
    int n=6;
    int m=7;
    int add=n+m;
    int mul=n*m;

    public static void m1() {
        Nonstatic n1 = new Nonstatic();
        System.out.println(n1.add);
    }
    public void m2(){
        System.out.println(n*m);
    }
    public static void main(){
        Nonstatic n2=new Nonstatic();
        System.out.println(n2.add);
        Nonstatic n1=new Nonstatic();
        System.out.println(n1.mul);

    }
}
