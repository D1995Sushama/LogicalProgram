package Conditional;

public class Nestediftriangle {
    public static void main(String[]args) {
        int side1 = 4;
        int side2 = 6;
        int side3 = 3;
        if ((side1 + side2) > side3) {
            if ((side1 + side3) > side2) {
                if ((side2 + side3) > side1) {
                    System.out.println("Valid Triange");
                } else {
                    System.out.println("Not Valid Triangle");
                }
            } else {
                System.out.println("Not Valid Triangle");
            }
        } else {
            System.out.println("Not Valid Triangle");
        }

    }
}
