package LogicalCoding;

public class Ex12_String5_removeDigitFromString {
    static void main(String[] args) {
      String str1="abfx432";
      String str2=" ";
      for (int i=0 ; i<=str1.length()-1 ; i++){
          char s1=str1.charAt(i);
          if(!Character.isDigit(s1)){
              str2=str2+s1;
          }
      }
        System.out.println(str2);
    }
}
