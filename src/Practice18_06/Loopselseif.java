package Practice18_06;

public class Loopselseif {
    public static void main(String[]args){
        int a=40;
        int b=80;
        int c=90;
        if(a>=b&&a>=c){
            System.out.println("Greatest Number is a");
        }
        else if(b>=a&&b>c){
            System.out.println("GreatestNumber is b");
        }
        else if(c>=a&&c>=b){
            System.out.println("GreatestNumber is c");
        }
    }
}
