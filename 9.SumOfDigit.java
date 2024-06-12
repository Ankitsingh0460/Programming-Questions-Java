import java.util.Scanner;

class SumOfDigit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your Number:");
    int num = input.nextInt();
    int sum = 0;

    while (num > 0) {

      sum += num % 10;
      num = num / 10;

    }
    System.out.println("Sum of Digit is :" + sum);

  }
}
