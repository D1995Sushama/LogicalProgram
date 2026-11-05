package LogicalCoding.StarPatternPrinting;

public class MirroreimageofTraingle_2 {
    static void main(String[] args) {
        int n=5;
        int a=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            a--;
            System.out.println();
        }

    }
}
