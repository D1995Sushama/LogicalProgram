package LogicalCoding;

public class Ex12_String10_SeperateNumbersFromString1 {
    static void main(String[] args) {
        String str="asbfd12345";
        String s2=str.substring(5);
        int num=Integer.parseInt(s2);
        System.out.println(num+9);
    }
}
