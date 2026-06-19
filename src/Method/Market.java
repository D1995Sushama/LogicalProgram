package Method;

public class Market {
    public static void main(String[]args){
        System.out.println("Daily Expence");
        m1(25,15,120,50);
        m2(4*5,5*2,15*5);
    }
    static void m1(int shuger,int salt,int oil,int tea){
        int totalex=shuger+salt+oil+tea;
        System.out.println("Total Expence="+totalex);
    }
    static void m2(int coffee,int shampoo,int magee){
        int total=coffee+shampoo+magee;
        System.out.println("Total pouch expence="+total);
    }
}
