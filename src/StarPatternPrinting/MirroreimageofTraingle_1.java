package StarPatternPrinting;

public class MirroreimageofTraingle_1 {
    static void main(String[] args) {
        int num=4;
        int a=num+1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
