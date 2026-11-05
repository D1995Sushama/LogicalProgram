package InterfaceandImpletation;

public interface Simcarddefault {
    void data ();
    void ac();
    default void sms(){

        System.out.println("sms:100");
    }
}
