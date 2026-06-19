package Conditional;

public class Elseifdiscount {
    public static void main(String[]args){
        int shopingAmt=25000;
        if(shopingAmt>=50000){
            System.out.println("20% discount");
        }
        else if(shopingAmt>=20000 &shopingAmt< 50000){
            System.out.println("10% discount");
        }
        else if(shopingAmt>=10000 &shopingAmt<20000){
            System.out.println("5% discount");
        }
        else if (shopingAmt<10000){
            System.out.println("no discount");
        }
    }
}
