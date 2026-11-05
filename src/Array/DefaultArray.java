package Array;

public class DefaultArray {
    public static void main(String[]args){
        System.out.println("---String Array-----");
        String[]ar=new String[5];
        ar[0]="abc";
        ar[1]="XYZ";
        for(String s1:ar){
            System.out.println(s1);
        }
        System.out.println("---String Array-----");
        int[]ar1=new int[4];
        ar1[0]=78;
        for(int s2:ar1){
            System.out.println(s2);
        }
}
}
