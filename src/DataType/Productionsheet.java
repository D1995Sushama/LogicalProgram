package DataType;

public class Productionsheet {
    static void main(String[] args) {
        String ProductName;
        String CustomerName;
        int ProductQuantity;
        int ProductRatePerProd;
        int TotalAmount;

        ProductName="Whiper";
        CustomerName="Bolero";
        ProductQuantity=500;
        ProductRatePerProd=10000;
        TotalAmount=ProductQuantity*ProductRatePerProd;
        System.out.println("ProductName:" + ProductName);
        System.out.println("CustomerName:" + CustomerName);
        System.out.println("ProductQuantity:" + ProductQuantity);
        System.out.println("ProductRatePerProd:" + ProductRatePerProd);
        System.out.println(" TotalAmount:" +  TotalAmount);

    }
}
