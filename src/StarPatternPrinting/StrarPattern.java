package StarPatternPrinting;

public class StrarPattern {
    //****
    //***
    //**
    //*
    //**
    //***
    //****
    static void main(String[] args) {
        int nst=4;
        int n= 7;
        for(int i=1;i<=n;i++) {
            for (int j =1; j <=nst; j++) {
                System.out.print("*");
            }
            if(i<4){
                nst--;
            }
            else{
                nst++;
            }
            System.out.println();
        }
    }
}
