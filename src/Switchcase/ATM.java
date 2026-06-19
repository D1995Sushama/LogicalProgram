package Switchcase;

public class ATM {
    public static void main(String[]args){
        int details=4;
        switch(details){
            case 1:
                System.out.println("Check Balance");
                break;
            case 2:
                System.out.println("Withdraw");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
