package UseofStatic_Non_Static;

public class Studentinformation {
    public static void main(String[]args){
        Student s1=new Student();
        s1.stdname="Sushama";
        s1.percentag=80.5f;
        s1.grade='A';
        Student.schoolname="SSVK";
        Student s2=new Student();
        s2.stdname="Nandkishor";
        s2.percentag=90f;
        s2.grade='A';
        Student.schoolname="SSVK";
        Student s3=new Student();
        s3.stdname="Vaishnavi";
        s3.percentag=85.80f;
        s3.grade='A';
        Student.schoolname="SSVK";
        s1.stdinfo();
        s2.stdinfo();
        s3.stdinfo();
    }
}
