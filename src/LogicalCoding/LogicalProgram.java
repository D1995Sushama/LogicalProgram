package LogicalCoding;

public class LogicalProgram {


// Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        System.out.println("-----factorial------");
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
        System.out.println("--------------n'thfactorial---------");
        System.out.println(fact);
        System.out.println("----------------table---------");
        int m=18;
        for(int j=m;j<=m*10;j+=m){
            System.out.println(j);
        }
        System.out.println("------even_odd-------");
        int k=13;
        if(k%2==0){
            System.out.println("even number="+k);
        }
        else{
            System.out.println("Odd number="+k);
        }
        System.out.println("----------List Of Even Number---------");

        for(int l=1;l<=100;l++){
            if(l%2==0){
                System.out.println(l);
            }
        }
        System.out.println("----------List Of Odd Number-------");
        for(int r=1;r<=100;r++){
            if(r%2!=0){
                System.out.println(r);
            }
        }
        System.out.println("---------Revers Number------------");
        int number=123456;
        int rev=0;
        while(number>0){
            int ld=number%10;
            rev=rev*10+ld;
            number=number/10;
        }
        System.out.println(rev);
        System.out.println("---------Revers String------------");

        String std="Sushama";
        String revers="";
        int len=std.length();

        for(int a=len-1;a>=0;a--){
            revers=revers+std.charAt(a);

        }
        System.out.println(revers);
        System.out.println("---------------Prime Number-----");
        int s=14;
        int t=0;
        for(int f=2;f<=s-1;f++){
            if(s%f==0){
                t=1;
                System.out.println("Consonent Number");
                break;
            }
            else if(t==0){
                System.out.println("Prime Number");
                break;
            }
        }
        if(s==1){
            System.out.println("Nither Prime Nor Consonent");
        }

        System.out.println("------Swap With Using Third Element----");
        int n1=12;
        int n2=13;
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("n1="+n1);
        System.out.println("n2="+n2);
        System.out.println("----Swap Without Using Third Element----");
        int num1=23;
        int num2=40;
        num1=num1+num2;//num1=63
        num2=num1-num2;//num2=23
        num1=num1-num2;//num1=40
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("-------Greatest Number-----------");
        int s1=12;
        int s2=13;
        int s3=14;
        if(s1>=s2&&s1>=s3){
            System.out.println("Largest Number Is s2="+s2);
        }
        if(s2>=s1&&s2>=s3){
            System.out.println("Largest Number Is s1="+s1);
        }
        if  (s3>=s1&&s3>=s2){
            System.out.println("Largest Number Is s3="+s3);
        }
        System.out.println("---------Square of Number--------");
        int squ=0;
        for(int i=1;i<=10;i++){
            squ=i*i;
            System.out.println(i+"="+squ);
        }
        System.out.println("-------Count the Digit-------------");
        int no=12345;
        int count=0;
        while(no>0){
            no=no/10;
            count++;
        }
        System.out.println(count);
        System.out.println("--------Digit Sum Of Given Number--------");
        int z=12345;
        int count1=0;
        int sum=0;
        while(z>0){
            int ldg=z%10;
            z=z/10;
            sum=sum+ldg;
            count1++;

        }
        System.out.println(count1);
        System.out.println(sum);
        System.out.println("------Power Of Number-------");
        int zp=12;
        int power=3;
        int result=1;
        for(int i=1;i<=power;i++){
            result=result*zp;
        }
        System.out.println(result);
        System.out.println("---------Leap Year------");
        int year=2000;
        if((year%100!=0)&&(year%4==0)||(year%400==0)){
            System.out.println("leapyear");
        }
        else{
            System.out.println("year is not leap");
        }
        System.out.println("---------Pelindrom Number------");
        int num=1213;
        int re=0;
        int org=num;
        while(num>0){
            int ld=num%10;
            re=re*10+ld;
            num=num/10;
        }
        System.out.println(re);
        if(org==re){
            System.out.println("Number is pelindrom");

        }
        else{
            System.out.println("Number is not pelindrom");

        }
        System.out.println("---------Count Char in String------");
        String al="Sushama";
        String rv="";
        int ct=0;
        int sm=std.length()-1;
        for(int i=1;i<=sm;i++){
            ct=i;
        }
        System.out.println(ct);



    }
}