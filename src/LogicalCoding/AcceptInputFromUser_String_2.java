package LogicalCoding;

import java.util.Scanner;

public class AcceptInputFromUser_String_2 {
    static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a name");
        String name=scan.nextLine();
        System.out.println("output="+name.toUpperCase());
    }
}
