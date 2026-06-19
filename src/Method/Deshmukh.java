package Method;

public class Deshmukh {

    static void main(String[] args) {
        System.out.println("Deshmukh"+" "+"Family");
        System.out.println("------------------------------------------");
        m1("Krishnarao","Sakhubai");
        System.out.println("------------------------------------------");
        m2("Vasantrao","vimal");
        Deshelderfam D1=new Deshelderfam();
        D1.m1("vasantrao","vimal");
        D1.m2("Manisha","Mohan","mauli","Sanu");
        D1.m3("Manoj","Rohini","Riyansh","Rajveer");
        D1.m4("kiran");
        System.out.println("-------------------------------------------");
        m3("Tukaram","Shobha");
        Deshmeed b1=new Deshmeed();
        b1.m1("Tukaram","Shobha");
        b1.m2("Vishal","Gauri","Devansh","Avira");
        b1.m3("Ashwini","Ashish");
        b1.m4("Deshraj");
        System.out.println("---------------------------------------------");
        m4("Tarachand","Vidya");
        Deshyun c1=new Deshyun();
        c1.m1("Tarachand","Vidya");
        c1.m2("Reshma","Nitiraj","Sushama");
        System.out.println("-----------------------------------------------");
        m5("Jaishri","Ramesh");
        System.out.println("-------------------------------------------------");
        Deshmukh1 d1=new Deshmukh1();
        d1.m1("Manisha","Manoj","kiran");
        System.out.println("--------------------------------------------------");
        d1.m2("Vishal","Ashwini","Deshraj");
        System.out.println("-----------------------------------------------------");
        d1.m3("Reshma","Nitiraj","Sushama");
        System.out.println("------------------------------------------------------");
        Yadav Y1=new Yadav();
        Y1.m1("Ramesh","Jayshri","Son","Priyanka");
        Y1.m2("Pravin","Sayli","Sai","Prithvi");
        Y1.m3("Priyanka","xyz","Aru");
        System.out.println("------------------------------------------------------------");
    }
    static void m1(String hfm,String hfw) {
        System.out.println("Grand Father ="+ hfm);
        System.out.println("Grand Mother ="+ hfw);
    }
    static void m2(String esn,String edl) {
        System.out.println("Elder Son ="+esn);
        System.out.println("Elder Dautherinlaw ="+ edl);
    }
    static void m3(String meuk,String meat) {
        System.out.println("Middle son ="+meuk);
        System.out.println("middle Dautherinlaw ="+meat);
    }
    static void m4(String ymen,String ywom) {
        System.out.println("Youngr Son ="+ymen);
        System.out.println("Younger Dautherinlaw ="+ywom);
    }
    static void m5(String yuw,String sl) {
        System.out.println("Dauther="+yuw);
        System.out.println("Soninlaw="+sl);
    }
}
