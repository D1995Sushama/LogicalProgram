package Practice9_6_26;

public class I_ConditionNestedif {
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c = 3;
        if (a >= b) {
            //System.out.println("Greatest Number=" + a);
            if (a >= c) {
                System.out.println("Greatest Number=" + a);
            }
        }
            if (b >= a) {
                //System.out.println("Greatest Number=" + b);
                if (b >= c) {
                    System.out.println("Greatest Number=" + b);
                }
            }
                if (c >= a){
                    //System.out.println("Greatest Number=" + c);
                    if(c >= b){
                        System.out.println("Greatest Number=" + c);
                }
            }
        }
    }

