package LogicalCoding;

import org.yaml.snakeyaml.scanner.Scanner;

public class Armstrong {
    static void main(String[] args) {
        int num = 153;
        int orgnum = num;
        int sum = 0;
        while(num>0) {
        int rev=num%10;
        sum=sum+rev*rev*rev;
        num=num/10;
        }
        if(sum==orgnum){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}



