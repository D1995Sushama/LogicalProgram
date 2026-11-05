package LogicalCoding;

import java.util.Scanner;

public class AcceptInputFromUser_Int_2 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number1=");
        int num1=scan.nextInt();
        System.out.println("Enter number2=");
        int num2=scan.nextInt();
        System.out.println("Addition"+(num1+num2));
    }
}
