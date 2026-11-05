package Array;

import java.util.Arrays;

public class Countperson {
    static void main(String[] args) {
        int [][]ar={{12,15,10},{14,16,19}};
        System.out.println(ar[0][1]);
        System.out.println(ar.length);
        System.out.println("----------------------");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=2;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }

}
