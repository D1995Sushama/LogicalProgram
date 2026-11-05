package ExceptionHandling;

public class Monday {
    static void main(String[] args) {


        int ar[]={12,14,15,17};
        try {
            try {
                System.out.println(ar[7]);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("String Exception Handling");
            }
            System.out.println(ar[7]);
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handling");

        }
        //finally {
            System.out.println("close");
       // }

    }
}
