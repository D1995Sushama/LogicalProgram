package LogicalCoding;

import java.util.Scanner;

public class aa {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1=");
        int num1 = scan.nextInt();
        System.out.println("Enter number2=");
        int num2 = scan.nextInt();
        System.out.println("Addition" + (num1 + num2));
        System.out.println("------------even & odd number------------");
        if (num1 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        int a = 0;
        System.out.println("---------prime number-------");
        for (int i = 2; i <= num1; i++) {
            if (num1 % i == 0) {
                a = 1;
                System.out.println("");

            }
        }
    }
}
