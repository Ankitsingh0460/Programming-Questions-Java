import java.util.Scanner;

class EvenOdd {

  public static void main(String[] args) {
    int a = 2;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Your Number:");
    int number = input.nextInt();
    int num = number % a;
    if (num == 0) {
      System.out.println("even number");

    } else {
      System.out.println("odd number");

    }

  }

}
