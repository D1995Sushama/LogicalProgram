package Practice18_06;

public class Methodcall {
    public static void main(String[] args) {
        System.out.println("Static and Non Static Method In Different Class-----------------");
        Methodstatic m1 = new Methodstatic();
        m1.sub();
        Methodstatic.add();
        System.out.println("Static and Non Static method In Same Class------");
        Methodcall.mul();
        Methodcall m2 = new Methodcall();
        m2.div();
    }

    public static void mul() {
        int a = 12;
        int b = 20;
        int mul = a * b;
        System.out.println("Multiplication Of Two Number Is=" + mul);
    }

    public void div() {
        int a = 15;
        int b = 5;
        int div = a / b;
        System.out.println("Division of two number is=" + div);

    }
}
