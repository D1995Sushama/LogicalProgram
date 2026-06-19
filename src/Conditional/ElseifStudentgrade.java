package Conditional;

public class ElseifStudentgrade {
    public static void main(String[]args){
        int mark=35;
        if(mark>=90){
            System.out.println("A");
        }
        else if(mark>=80 &mark<90){
            System.out.println("B");
        }
        else if(mark>=70 &mark<80){
            System.out.println("C");
        }
        else if(mark>=60 &mark<70){
            System.out.println("D");
        }
        else if(mark>=50 &mark<60){
            System.out.println("E");
        }
        else if(mark<40){
            System.out.println("Fail");
        }
    }
}
