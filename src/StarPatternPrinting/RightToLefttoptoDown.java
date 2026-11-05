package StarPatternPrinting;

public class RightToLefttoptoDown {
//    * * * *
//      * * *
//        * *
//          *
static void main(String[] args) {
    int n=5;
    int nst=n;
    int nsp=0;

    for(int i=1;i<=n;i++){
        for(int j=1;j<=nsp;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=nst;j++){
            System.out.print("*");
        }
        nsp++;
        nst--;
        System.out.println();
    }
}
}
