package Conditional;

public class Nestedifleapyear {
    public static void main(String[]args){
        int year=1972;
        if(year%4==0) {
            if (year % 100 != 0) {
                System.out.println("Year Is Leap");
            } else {
                if (year % 400 == 0) {
                    System.out.println("Year Is Leap");
                } else {
                    System.out.println("Year Is Not Leap");
                }
            }
        }
            else{
                  System.out.println("Year Is Not Leap");
                }
            }
        {
            System.out.println("Year Is Not Leap");
        }
    }

