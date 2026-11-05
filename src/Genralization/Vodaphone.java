package Genralization;

public class Vodaphone implements Simcard {
    public void net(){
        System.out.println("net=300mb");
    }
    public void msg(){
        System.out.println("msg=200");
    }
    public void call(){
        System.out.println("call=500");
    }

    static void main(String[] args) {
        Vodaphone v1=new Vodaphone();
        v1.call();
        v1.msg();
        v1.net();
        Idea i1=new Idea();
        i1.call();
        i1.msg();
        i1.net();
        Jio j1=new Jio();
        j1.net();
        j1.msg();
        j1.msg();
    }
}
