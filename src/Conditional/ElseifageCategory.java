package Conditional;

public class ElseifageCategory {
    public static void main(String[]args){
        int Age=50;
        if(Age<=13){
            System.out.println("Child");
        }
        else if(Age>=13 &Age<19){
           System.out.println("Teenager");
        }
        else if(Age>=20 & Age<59){
            System.out.println("Adult");
        }
        else if(Age >60){
            System.out.println("Senior Citizen");
        }
    }
}