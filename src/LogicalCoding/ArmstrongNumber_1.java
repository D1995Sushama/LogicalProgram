package LogicalCoding;

import java.util.Scanner;

public class AcceptInputFromUser_String_1 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Number=");
        int num=scan.nextInt();//234
        int org=num;
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum=sum+ld*ld*ld;
            num=num/10;

        }
        if(org==sum){
            System.out.println("number is armstrong");
        }
        else{
            System.out.println("number is not armstrong");
        }
    }
}
