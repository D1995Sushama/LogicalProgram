package Switchcase;

public class Arithmatic {
    public static void main(String[]args){
        int a=40;
        int b=5;
        int choice =4;
        switch(choice){
            case 1:
                System.out.println("Multiplication="+(a*b));
                break;
            case 2:
                System.out.println("Addition="+(a+b));
                break;
            case 3:
                System.out.println("Substraction="+(a-b));
                break;
            case 4:
                System.out.println("Dividetion="+(a/b));
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
