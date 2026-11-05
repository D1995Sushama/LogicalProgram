package ExceptionHandling;

public class Saturday {
    public static void main(String[]args){
        int a=17;
        int b=0;
        int res=0;
        try{
            System.out.println(res=a/b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Handling");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Excepyion Handling");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("running final block");
        }
        System.out.println("hi");
    }
}
