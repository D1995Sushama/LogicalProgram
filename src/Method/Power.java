package Method;

public class Power {
    static void main(String[] args) {
        Power p1=new Power();
        p1.squ(4,4);
        p1.qub(4,4,4);
        Power1 w1=new Power1();
        w1.squ(21,21);
        w1.qub(21,21,21);
        w1.fourthpo(21,21,21,21);
    }
    void squ(int a,int b) {
       int  squ=a*b;
        System.out.println("Squ="+squ);
    }
    void qub(int a,int b,int c) {
        int qub=a*b*c;
        System.out.println("qub="+qub);
    }
}
