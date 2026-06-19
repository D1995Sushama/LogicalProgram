package Switchcase;

public class Geomatric {
    public static void main(String[]args){
        int a=6;
        int b=5;
        int choice=5;
        switch(choice){
            case 1:
                System.out.println("Area of Rectangle Is = "+(a*b));
                break;
            case 2:
                System.out.println("Perimeter of Rectangle Is = "+2*(a+b));
                break;
            case 3:
                System.out.println("Area Of Square Is ="+(a*a));
                break;
            case 4:
                System.out.println("Perimeter Of Square Is="+(4*a));
                break;
            case 5:
                System.out.println("Area Of Circle Is="+(22.0/7*a*a));
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
