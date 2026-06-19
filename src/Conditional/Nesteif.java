package Conditional;

public class Nesteif {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 9;
        if (a >= b) {
            if (a >= c)
                System.out.println("Gretest Number Is = a"+"=" + a);
            else
                System.out.println("Greatest Number Is = a"+"=" + a);
        } else {
            if (b >= c) {
                System.out.println("Greatest Number Is = b"+"=" + b);
            } else {
                System.out.println("Greatest Number Is = b"+"=" + b);
            }
        }

    }





}
