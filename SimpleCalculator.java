//SimpleCalculator.java by Mr. Considine
import java.util.*;

class SimpleCalculator {

  public SimpleCalculator() {

  }

  public Integer factorial(int f) {
    int res = 1;
    //decrease by 1 each time
    for (int i = f; i > 0; i--) {
      res = res*i;
    }
    return res;
  }

  public Integer exponent(int base, int power) {
    int res = 1;
    //loop power number of times
    for (int i = 0; i < power; i++) {
      res = res*base;
    }
    return res;
  }

  public static void main(String[] args) {
    SimpleCalculator calc = new SimpleCalculator();
    System.out.println("Choose what to calculate:");
    System.out.println("1. Exponent");
    System.out.println("2. Factorial");
    Scanner choice = new Scanner(System.in);
    int c = choice.nextInt();
    if (c == 1) {
      System.out.println("Give the base number:");
      Scanner inp = new Scanner(System.in);
      int num1 = inp.nextInt();
      System.out.println("Give the power:");
      Scanner inp2 = new Scanner(System.in);
      int num2 = inp2.nextInt();

      System.out.println("Your result:");
      int result = calc.exponent(num1, num2);
      System.out.println(result);
    }
    if (c == 2) {
      System.out.println("Give the base number:");
      Scanner inp = new Scanner(System.in);
      int num1 = inp.nextInt();

      System.out.println("Your result:");
      int result = calc.factorial(num1);
      System.out.println(result);
    }



  }
}
