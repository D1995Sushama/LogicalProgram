package Method;

public class Smark {
    void std(int a){
        System.out.println("Standerd="+a);
    }
    void name(String fn,String ln){
        System.out.println("Student Name="+fn+" "+ln);
    }
    void sum(int s1,int s2,int s3,int s4,int s5,int s6){
        int total=s1+s2+s3+s4+s5+s6;
        float per=total/6f;
        System.out.println("Total Mark="+total);
        System.out.println("Percentage="+per);
    }
    void grade(char a){
        System.out.println("Grade="+a);
    }
}
