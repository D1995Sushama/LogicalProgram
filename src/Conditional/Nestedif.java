package Conditional;

public class Nestedif {
    public static void main(String[]args){
        int precutoff=75;
        if(precutoff>=70){
            System.out.println("Clear Prelims");
            int maincutoff=40;
            if(maincutoff>=60)
                System.out.println("Clear Mains");
            else
                System.out.println("Not Clear Mains");

            }
        else{
            System.out.println("Not Applicable Mains");
        }
    }
}
