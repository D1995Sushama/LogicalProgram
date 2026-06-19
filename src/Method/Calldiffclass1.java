package Method;

public class Calldiffclass1 {
    static void main(String[] args) {
       Fullname1("Sushama","Deshmukh");
       Calldiffclass1 C1=new Calldiffclass1();
       C1.Fullname2("Reshma","Deshmukh");
       C1.Fullname3("Nitiraj","Deshmukh");
       Calldiffclass C2=new Calldiffclass();
       C2.Fullname1("Nandkishor","Gongade");
       C2.Fullname2("Akshaya","Deshmukh");
       C2.Fullname3("Vaishnavi","Kadam");
    }

    static void Fullname1(String fn,String ln) {
        String firstname ="Sushama";
        String lastname="Deshmukh";
        System.out.println("Sushama"+" "+"Deshmukh");
    }

    void Fullname2(String fn,String ln ) {
        String firstname="Reshma";
        String lastname="Deshmukh";
        System.out.println("Reshma"+" "+"Deshmukh");
    }

    void Fullname3(String fn,String ln) {
        String firstname="Nitiraj";
        String lastname="Deshmukh";
        System.out.println("Nitiraj"+" "+"Deshmukh");
    }
}
