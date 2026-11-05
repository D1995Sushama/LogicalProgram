package StarPatternPrinting;

public class HalfDimound {
    //*
    //**
    //***
    //**
    //*
    static void main(String[] args) {
        int n=5;
        int nst=1;
        int nsp=0;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=nst;j++){
                    System.out.print("*");
            }
            if(i<3){
                    nst++;
            }
            else{
                nst--;
            }
            System.out.println();
        }

        }
    }

