package Switchcase;

public class Week {
    public static void main(String[]args){
        int daynum=5;
        switch(daynum)
        {
            case 1:
                System.out.println("Today is Mon");
                break;
            case 2:
                System.out.println("Today is Tus");
                break;
            case 3:
                System.out.println("Today is Wen");
                break;
            case 4:
                System.out.println("Today is Thu");
                break;
            case 5:
                System.out.println("Today is Fri");
                break;
            case 6:
                System.out.println("Today is Sat");
                break;
            case 7:
                System.out.println("Today is Sun");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
