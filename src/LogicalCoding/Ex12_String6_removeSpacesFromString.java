package LogicalCoding;

public class Ex12_String6_removeSpacesFromString {
    static void main(String[] args) {
       replace();
       isWhitespace();
    }
    public static void replace(){
        String str1="ab  cd";
        System.out.println(str1);
        String str2= str1.replace(" ","");
        System.out.println(str2);
    }
    public static void isWhitespace(){
        String str2="ab  cd";
        String str3=" ";
        for(int i=0;i<=str2.length()-1;i++){
            char ch=str2.charAt(i);
            if(!Character.isWhitespace(ch)){
              str3=str3+ch;
            }
        }
        System.out.print(str3);
    }
}
