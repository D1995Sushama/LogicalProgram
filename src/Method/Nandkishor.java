package Method;

public class Nandkishor {
    public static void main(String[]arg){
        System.out.println("Exam form fee");
        m1(850,850,850,850);
        m2(850,850,850);
        m3(60,100,60,100);
    }
    static void m1(int IBPSPO,int SBI,int RBI,int RRB){
        int totalexpence=IBPSPO+SBI+RBI+RRB;
        System.out.println("Total ExpenceFor Formfilling="+totalexpence);
    }
    static void m2(int IBPSclk,int SBIclk,int RRBclk){
        int totalexpence=IBPSclk+SBIclk+RRBclk;
        System.out.println("Total Expence For Formfilling="+totalexpence);
    }
    static void m3(int pen,int pencil,int notebook,int pages){
        int totalexpence=pen+pencil+notebook+pages;
        System.out.println("Total Expence For Stationery="+totalexpence);
    }
}
