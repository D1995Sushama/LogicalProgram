package String;

public class Friday {

    static void main(String[] args) {
        System.out.println("----lenghth-------");
        String s1=" vidya ";
        String s2="";
        String s3="sushama";
        String s4="vidya";
        String s5="I Love My Aai";

        System.out.println(s1.length());
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());
        System.out.println("------------Modify---------");
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.replace("vidya","sushama"));
        System.out.println(s1.concat(s3));
        System.out.println("------compare------");
        System.out.println(s4.equals(s3));
        System.out.println(s4.equalsIgnoreCase(s3));
        System.out.println("------Search--------");
        System.out.println(s1.contains("ya"));
        System.out.println(s1.startsWith("v"));
        System.out.println(s1.endsWith("a"));
        System.out.println(s1.indexOf("v"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println("------extract-------");
        System.out.println(s1.substring(2));
        System.out.println(s1.charAt(3));
        System.out.println("-----Split------");
        String []ar=s5.split("");
        System.out.println(ar[2]);
        //String []ar=s1.split("");
        //System.out.println(ar[2]);

    }
}
