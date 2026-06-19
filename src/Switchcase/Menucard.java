package Switchcase;

public class Menucard {
    public static void main(String[]args){
        int hotel=2;
        switch(hotel){
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                System.out.println("Sandwich");
                break;
            case 3:
                System.out.println("Vada pav");
                break;
            case 4:
                System.out.println("Pav Bhaji");
                break;
            default:
                System.out.println("Invalid Input");
                break;

        }
    }
}
