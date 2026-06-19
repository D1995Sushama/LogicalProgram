package Conditional;

public class ElseifTriangle {
    public static void main(String[]args){
        int side1=5;
        int side2=4;
        int side3=6;
        if(side1==side2&&side2==side3&&side1==side3){
            System.out.println("Equilateral Triangle");
        }
        else if(side1==side2 ||side1==side2 ||side2==side3){
            System.out.println("Isosceles");
        }
        else if(side1!=side2&&side2!=side3&&side1!=side3){
            System.out.println("Scalene");
        }

    }
}