package Conditional.dowhileloop;

public class Odd{
    public static void main(String[]args){
        System.out.println("Odd Number");
        int i=1;
        do{
            if(i%2!=0)
                System.out.println(i);
            i++;
        }
        while(i<=100);
    }
}
