package StarPatternPrinting;

public class MirroreimageofTraingle_2 {
//            *******
//            *****
//            ***
//            *
    static void main(String[] args) {
        int n=7;
        int nst=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nst-=2;
            System.out.println();
        }

    }
}
