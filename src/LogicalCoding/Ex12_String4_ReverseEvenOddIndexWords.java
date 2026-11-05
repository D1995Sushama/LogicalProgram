package LogicalCoding;

public class Ex12_String4_ReverseEvenOddIndexWords {
    static void main(String[] args) {
        String s1 = "my name is sushama";
        String[] ar = s1.split(" ");
        for (int i = 0; i < ar.length; i++) {
            String org = ar[i];
            if (i % 2 == 1) {
                System.out.print(reversString(org)+ " ");
            } else {
                System.out.print(org + " ");
            }
        }
    }
        public static String reversString(String org){

          String rev="";
          for(int j= org.length()-1;j>=0;j--){
              rev=rev+org.charAt(j);
          }
          return rev;
        }
    }

