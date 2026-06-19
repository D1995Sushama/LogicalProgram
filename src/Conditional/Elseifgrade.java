package Conditional;

public class Elseifgrade {
    public static void main(String[]args){
        int mark= 55;
        if(mark>=65){
            System.out.println("Distinction");
        }
        else if(mark>=60 &mark<65){
            System.out.println("1st class");
        }
        else if(mark >=50 &mark<60){
            System.out.println("2nd class");
        }
        else if(mark>=40 &mark<50){
            System.out.println("3rd class");
        }
        else if(mark>=35 &mark<40){
            System.out.println("Pass");
        }
        else if(mark<35){
            System.out.println("Fail");
        }
    }
}
