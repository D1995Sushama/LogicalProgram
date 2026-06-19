package Conditional;

public class Leapyear {
    public static void main(String[] args) {
        int year = 1987;
        if (year% 4== 0 && year % 100 != 0 || year %400 == 0) {
            ;
            System.out.println("Year Is Leap" + year);
        }
        else{
            System.out.println("Year Is not Leap"+year);
        }
    }
}
