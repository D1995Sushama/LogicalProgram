package Assignment;

import java.util.Scanner;

public class Wednesday1 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1 = scan.nextInt();
        //System.out.println("enter number="+num1);
        //int num2 = scan.nextInt();
        //System.out.println("enter number="+num2);
      //  for(int i=1;i<=num1;i++){
         //   System.out.print("*");
       // }
        for(int j=1;j<=num1-1;j++){
            System.out.println("");
            for(int k=1;k<=num1-1;k++){
                System.out.print("*");
            }
        }
    }
}
