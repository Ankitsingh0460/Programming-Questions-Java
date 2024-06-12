import java.util.Scanner;

class ReverceTheDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Number ");
    int num = input.nextInt();
    int newNum = 0;
    while (num > 0) {
      int Digit = num % 10;

      newNum = newNum * 10 + Digit;
      num /= 10;

    }
    System.out.println(newNum);

  }
}
