package LogicalCoding;

public class Ex12_String2_PrintStatementInreverseOrder {
    static void main(String[] args) {
        String s1 = "my name is sushama";

        String[]scr= s1.split(" ");

         int a=scr.length-1;

         for(int i=a;i>=0;i--){
             System.out.print(scr[i]+" ");
         }

    }
}

