import java.util.Scanner;

/**
 * 14.Palindrome
 */
class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Number ");
    int num1 = input.nextInt();
    int newNum = 0;
    int num = num1;

    while (num > 0) {
      int digit = num % 10;
      newNum = newNum * 10 + digit;
      num /= 10;

    }
    if (newNum == num1) {
      System.out.println("Palindrome Number");
    } else {
      System.out.println("Not a Palindrome Number");
    }

  }

}