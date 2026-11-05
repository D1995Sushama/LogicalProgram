package Assignment;

public class Friday {
    public static void main(String[] args) {
        int num = 12;
        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        int num1 = 5;
        int fact = 1;
        for (int i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        int num2=13;
        int a=0;
        for(int j=2;j<=num2-1;j++) {
            if (num2 % j == 0) {
                a = 1;
                System.out.println("number is consonent");
                break;
            }
           else if (a == 0) {
                System.out.println("number is prime");
                break;
            }
        }
        if(a==1){
            System.out.println("number is not prime nor consonent");
        }
        String name="Sushama";
        String rev= "";
        int n=name.length()-1;
        for(int i=n;i>=0;i--){
            rev=rev+ name.charAt(i);
        }
        System.out.println(n);
        System.out.println(rev);
        int n3=12345;
        int rev1=0;
        int count=0;
        while(n3>0) {
            int ld = n3 % 10;
            rev1 = rev1 * 10 + ld;
            n3 = n3 / 10;
            count++;
        }
        System.out.println(count);
            System.out.println(rev1);
            int n4=1234;
            int rev2=0;
            int org=n4;
            while(n4>0){
                int ldd=n4%10;
                rev2=rev2*10+ldd;
                n4=n4/10;
            }
        System.out.println(rev2);
            if(org==rev2){
                System.out.println("number is pelindrome");
            }
            else{
                System.out.println("number is not pelindrom");
            }



    }
}