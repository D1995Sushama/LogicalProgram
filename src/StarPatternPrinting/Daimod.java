package StarPatternPrinting;

public class Daimod {
    //   *
    //  ***
    // *****
    //*******
    // *****
    //  ***
    //   *
    static void main(String[] args) {
        int nst=1;
        int n=7;
        int nsp=3;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<4){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }

        }
    }
}
