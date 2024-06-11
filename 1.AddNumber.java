import java.util.Scanner;

class Add {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int num1 = input.nextInt();
    System.out.println("Enter 2nd Number:");
    int num2 = input.nextInt();
    System.out.println(num1 + num2);

  }
}