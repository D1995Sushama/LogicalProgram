package Method;

public class Mybestu {
    static void main(String[] args) {
        System.out.println("My bestu is like my family");
        m1("Sujata","Bhujangrao");
        m2("14 Aug 1995","15 jan 2023");
        m3("Xyz","Ketaki Mategaonkar");
        Mybestu B1=new Mybestu();
        B1.m4("Imran hashmi","Ketaki Mategaonkar");
        B1.m5("Nandkumar","Ankita","Anushri");

    }

    static void m1(String mom,String dad) {
        String aai="Sujata";
        String baba="Bhujangrao";
        System.out.println("Aai="+aai);
        System.out.println("Baba="+baba);
    }
    static void m2(String bd,String an){
        String birthdate="14 Aug 1995";
        String aniversary="15 jan 2023";
        System.out.println("Birth date="+birthdate);
        System.out.println("Anivarsary="+aniversary);
    }
    static void m3(String gf,String crs){
        String girlfriend="XYZ";
        String crush="Ketaki Mategaonkar";
        System.out.println("Girl Friend="+girlfriend);
        System.out.println("Crush="+crush);
    }
    void m4(String hr,String sg){
        String favhero="Imranhashmi";
        String favsong="Kahani Suno";
        System.out.println("Favourite Hero="+favhero);
        System.out.println("Favourite Song="+favsong);
    }
    void m5(String bro,String sl,String nc){
        String brother="Nandkumar";
        String sisterinlaw="Ankita";
        String nice="Anushri";
        System.out.println("Brother="+brother);
        System.out.println("Sister in law="+sisterinlaw);
        System.out.println("Nice="+nice);

    }

}
