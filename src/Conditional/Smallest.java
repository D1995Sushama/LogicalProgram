package Conditional;

public class Smallest {
    public static void main(String[]args){
        int a=1;
        int b=3;
        int c=2;
        int d=4;
        int e=5;
        if(a<b&&a<c&&a<d&&a<e) {
            System.out.println("Smallest Number Is a =" + a);
        }
        else {
            System.out.println("Largest Number Is a="+a);
        }
            if(b<a&&b<c&&b<d&&b<e) {
                System.out.println("Smallest Number Is b=" +b);
            }
            else {
                System.out.println("Largest Number Is b="+b);
            }
               if(c<a&&c<b&&c<d&&c<e) {
                   System.out.println("Smallest Number Is c=" + c);
               }
               else {
                   System.out.println("Largest Number Is c="+c);
               }
                   if(d<a&&d<b&&d<c&&d<e) {
                       System.out.println("Smallest Number Is d=" + d);
                   }
                   else {
                       System.out.println("Largest Number Is d="+d);
                   }
                        if (e < a && e < b && e < c && e < d) {
                            System.out.println("Smallest Number Is e="+e);
                        }
                        else {
                            System.out.println("Largest Number Is e="+e);
                        }
                    }

    }

