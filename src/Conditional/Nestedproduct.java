package Conditional;

public class Nestedproduct {
    public static void main(String[] args) {
        float vtg = 12;
        int current = 2;
        int cycle = 55;

        if (vtg >=11.5 && vtg <= 14.5) {
            System.out.println("Voltage Ok");
            if (current >=1 && current <= 3) {
                System.out.println("Current Ok");
                if (cycle >= 30 && cycle <= 45) {
                    System.out.println("Cycle Ok");
                    System.out.println("Product Is Ok");
                } else {
                    System.out.println("Cycle Not Ok");
                    System.out.println("Product Is Not Ok");
                }
            } else {
                System.out.println("Current Not Ok");
                System.out.println("Product Is Not Ok");
            }
        }
        else{
                    System.out.println("Voltage Not Ok");
                    System.out.println("Product Is Not Ok");
                }
            }

        }

