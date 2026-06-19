package Method;

public class Guddi {
    public static void main(){
        System.out.println("Family Of Guddi");
        Guddi G1=new Guddi();
        G1.m1("Gorakhnath","Sangita");
        G1.m2("Vaishnavi","Vaibhavi"," Vaidehi");
        G1.m3("Vaishnavi","Abhijit");
    }
    void m1(String manofthefamily,String womenofthefamily){
        System.out.println("Man Of The Family="+manofthefamily);
        System.out.println("Women Of The Family="+womenofthefamily);
    }
    void m2(String yelddau,String midddau,String yungdau){
        System.out.println("Yelder Daughter="+yelddau);
        System.out.println("Middel Daughter="+midddau);
        System.out.println("Yunger Daughter="+yungdau);
    }
    void m3(String yelderdau,String soninlaw){
        System.out.println("Yelder Daughter="+yelderdau);
        System.out.println("Son In Law="+soninlaw);
    }
}
