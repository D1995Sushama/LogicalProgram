package Assignment;

public class StringPalindrom {
    static void main(String[] args) {
        String org="madam";
        String rev="";
        int num=org.length()-1;
        for(int i=num;i>=0;i--){
            rev=rev+org.charAt(i);
        }
        System.out.println(rev);
        if(org.equals(rev)){
            System.out.println("String Is Palindrome");
        }
        else{
            System.out.println("String Is Not Palindrome");
        }
    }
}
