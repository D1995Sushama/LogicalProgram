package Conditional;

public class Nestedifsignin {
    public static void main(String[]args){
        String username="xyz";
        String password="456";
        if(username=="xyz") {
            System.out.println("Valid Username");
            if (password == "123"){
                System.out.println("Valid Password");
            System.out.println("Login Account");
        }
            else{
                System.out.println("InValid Password");
            }

        }
        else
            System.out.println("Invalid Username");
    }
}
