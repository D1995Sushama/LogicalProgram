package UseofStatic_Non_Static;

public class Emplinformation {
    public static void main(String[]args) {
        Employee e1 = new Employee();
        e1.empname = "Amol";
        e1.empID = 101;
        Employee.epmCEOname = "ABC";
        Employee e2 = new Employee();
        e2.empname = "Rahul";
        e2.empID = 102;
        Employee.epmCEOname = "ABC";
        Employee e3 = new Employee();
        e3.empname = "Shubham";
        e3.empID = 103;
        Employee.epmCEOname = "XYZ";
        e1.empinfo();
        e2.empinfo();
        e3.empinfo();



    }
}
