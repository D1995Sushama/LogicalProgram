package Array;

import java.util.Arrays;

public class Array2Dimentional {
    public static void main(String[] args) {
        int[][] ar = new int[2][3];
        //   0   1   2
        // 0  10  20  30
        // 1  40  50  60
        System.out.println(ar.length);
        ar[0][0] = 10;
        ar[0][1] = 20;
        ar[0][2] = 30;
        ar[1][0] = 40;
        ar[1][1] = 50;
        ar[1][2] = 60;
        System.out.println("------Before Replacement-------");

        for (int i = 0; i <= 1; i++) {

            for (int j = 0; j <= 2; j++) {

                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
        //int temp=ar[0][1];
       // ar[0][1]=ar[1][2];
        //ar[1][2]=temp;
        System.out.println("------ After Replacement-------");
        ar [1][1]=70;
        for (int k = 0; k <= 1; k++) {
            for (int l = 0; l <= 2; l++) {
                System.out.print(ar[k][l] + " ");
            }
            System.out.println();
        }


    }
}
