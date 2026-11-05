package LogicalCoding;

import static dev.failsafe.internal.util.Maths.add;

public class Ex11_addTwoNumbers_WithoutAdditionOperator2 {
    static void main(String[] args) {
        System.out.println(add(5,6));
    }
    public static int add(int num1,int num2){
      for(int i=1;i<=num2;i++){
          num1++;
      }
      return num1;
    }
}
