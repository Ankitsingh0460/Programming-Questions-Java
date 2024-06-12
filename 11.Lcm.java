import java.util.Scanner;

class Lcm {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your 1st Number ");
    int num1 = input.nextInt();
    System.out.print("Enter Your 2nd Number");
    int num2 = input.nextInt();
    int i = 1;
    while (i <= num2) {
      int factor = num1 * i;
      if (factor % num2 == 0) {

      }
      System.out.println(factor);
      i++;
    }
  }

}
