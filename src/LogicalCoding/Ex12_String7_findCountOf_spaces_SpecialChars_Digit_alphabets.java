package LogicalCoding;

public class Ex12_String7_findCountOf_spaces_SpecialChars_Digit_alphabets {
    static void main(String[] args) {
        String s1="acvsfd   1234  @#$%";
        int alphabetcount=0;
        int specialcharcount=0;
        int spacecount=0;
        int digitcount=0;
        for(int i=0;i<=s1.length()-1;i++){
         char ch=s1.charAt(i);
         if(Character.isLetter(ch)){
             alphabetcount++;
         }
         else if(Character.isDigit(ch)){
             digitcount++;
         }
         else if (Character.isSpaceChar(ch)){
             spacecount++;
            }
         else {
             specialcharcount++;
         }


        }
        System.out.println("alphabetcount="+alphabetcount);
        System.out.println("specialcharcount="+specialcharcount);
        System.out.println("spacecount="+spacecount);
        System.out.println("digitcount="+digitcount);
    }
}
