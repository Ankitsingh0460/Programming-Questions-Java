import java.util.Scanner;

class GratestNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st Number:");
    int num1 = input.nextInt();
    System.out.println("Enter 2st Number:");
    int num2 = input.nextInt();
    System.out.println("Enter 3st Number:");
    int num3 = input.nextInt();

    if (num1 >= num2 && num1 >= num3) {
      System.out.println(num1 + "is gratter");

    } else if (num2 >= num3) {
      System.out.println(num2 + "is gratter");

    } else {
      System.out.println(num3 + "is gratter");
    }

  }
}
