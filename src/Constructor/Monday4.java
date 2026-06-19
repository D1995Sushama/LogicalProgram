package Constructor;

public class Monday4 {
    String  a;
    String  b;
    Monday4(String name1,String name2){
          a=name1;
          b=name2;
    }
    public void myname(){
        System.out.println("My Name="+a+" "+b);
    }
    public void friname(){
        System.out.println("My Friend Name="+a+" "+b);
    }
    public static void main(String[]args){
        Monday4 m1=new Monday4("Sushama","Deshmukh");
        m1.myname();
        Monday4 m2=new Monday4("Nandkishor","Ghongde");
        m2.friname();
    }
}
