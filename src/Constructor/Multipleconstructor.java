package Constructor;

public class Multipleconstructor {
    int a;
    int b;
    String stdname;
    char bloodgrup;
    String mobnum;
    float hight;
    float weight;
    Multipleconstructor(int a,int b){
        a=12;
        b=13;
    }
    Multipleconstructor(String stdname,String mobnum){
        stdname="Sushama Deshmukh";
        mobnum="9881737262";
    }
    Multipleconstructor(float hight,float weight){
        hight=5.4f;
        weight=55.5f;
    }
    Multipleconstructor(char bloodgrup){
        bloodgrup='O';
    }
    public void stdname(){
        System.out.println("Student Name="+stdname);
    }
    public void mobnum(){
        System.out.println("Mobile Number Is="+mobnum);
    }
    public void higweight(){
        System.out.println("Hight"+hight);
        System.out.println("Weight"+weight);
    }
}
