package StarPatternPrinting;

public class OppositeTraingle {

    //*******
    // *****
    //  ***
    //   *
    static void main(String[] args) {
        int n=4;
        int nst=7;
        int nsp=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nst-=2;
            nsp++;
            System.out.println();

        }
    }
}
