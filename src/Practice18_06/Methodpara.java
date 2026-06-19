package Practice18_06;

public class Methodpara {
    public static void main(String[]args) {
        System.out.println("Static nonstatic with parameter in same class");
        Methodpara.add(12,23);
        Methodpara m1=new Methodpara();
        m1.sub(29,20);
        System.out.println("Static non static withou parameter in differentclass");
        Methodstatic m4=new Methodstatic();
        m4.sub();
        Methodstatic.add();
    }
        public static void add(int a,int b){
            int sum=a+b;
            System.out.println("Addition of two number is="+sum);
        }
        public void sub(int a,int b){
        System .out.println("Substraction of two number is="+(a-b));
        }
    }

