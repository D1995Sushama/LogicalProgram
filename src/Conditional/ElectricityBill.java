package Conditional;

public class ElectricityBill {
    public static void main(String[]args){
        int unit=400;
        if (unit<100){
            System.out.println("No any charg");
        }
        else if(unit >=100 &unit<200){
            System.out.println("Rs 5/unit");
        }
        else if(unit >=200 &unit<300){
            System.out.println("Rs 7/unit");
        }
        else if(unit>300){
           System.out.println("Rs 10/unit");
        }
    }
}
