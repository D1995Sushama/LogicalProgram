package Conditional;

public class Greatestnum {
    public static void main(String[]args){
        int x=5;
        int y=2;
        int z=8;
        if(x>=y &&x>=z){
           System.out.println("Greatest Number Is x="+x);
        }
        else if(y>=x&& y>=z){
            System.out.println("Greatenst Number Is y="+y);
        }
        else{// (z>=x&&z>=y){
            System.out.println("Greatest Number Is z="+z);
        }
    }
}
