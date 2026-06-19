package Practice9_6_26;

public class G_Conditionelseif {
    public static void main(String[]args){
        int per=60;
        if(per>=80&&per<=100)
            System.out.println("A");
        else if(per>=60&&per<=80)
            System.out.println("B");
        else if(per>=40&&per<=60)
            System.out.println("C");
        else if(per<35)
            System.out.println("Fail");

    }
}
