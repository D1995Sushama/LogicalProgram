package LogicalCoding;

import java.util.Scanner;

public class ArmstrongNumber_4 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        int org=num;
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum=sum+ld*ld*ld;
            num=num/10;
        }
        if(sum==org){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }

    }
}
