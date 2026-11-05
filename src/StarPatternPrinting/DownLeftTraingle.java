package LogicalCoding.StarPatternPrinting;

import java.util.Scanner;

public class DownLeftTraingle {
    static void main() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number=");
        int num=scan.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
