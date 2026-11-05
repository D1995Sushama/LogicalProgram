package ExceptionHandling;

public class Friday {
    static void main(String[] args) {
      String s1="advgs";


            try{
                System.out.println(s1.charAt(9));
            }
            catch (StringIndexOutOfBoundsException e){
                System.out.println("StringIndexOutOfBoundsException Handeling");

            }

            finally{
                System.out.println("running final");
            }



        System.out.println("hi");
    }
}
