package Method;

public class Marksheet {
    public static void main(String[]args){
        std(10);
        name("Vaishnavi","Deshmukh");
        sum(80,86,75,78,90,73);
        grade('A');
        System.out.println("------------------");
        Smark a1=new Smark();
        a1.std(10);
        a1.name("Sushama","Deshmuk");
        a1.sum(80,86,75,78,90,73);
        a1.grade('A');

    }
    static void std(int n1) {
        System.out.println("Standerd=" + n1);
    }
    static void name(String fn,String ln){
        System.out.println("Student Name="+fn+" "+ln);
    }
    static void sum(int s1,int s2,int s3,int s4,int s5,int s6) {
        int total = s1 + s2 + s3 + s4 + s5 + s6;
        System.out.println("Total mark=" + total);
        float per=total/6f;
        System.out.println("Percentage="+per);
    }
    static void grade(char a){
        System.out.println("Grade="+a);
    }
}
