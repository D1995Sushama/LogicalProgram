package LogicalCoding;

public class Ex12_String1_SplitStatement {
    static void main(String[] args) {
        String s1="my name is sushama";

        String [] scr=s1.split(" ");

        System.out.println(scr.length);

        int a= scr.length-1;

        for(int i=0;i<=a;i++){
            System.out.println(scr[i]);
        }
    }
}
