import java.util.Scanner;

class SumAllOddNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number:");
    int number = input.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= number) {
      sum = sum + i;
      i += 2;
    }
    System.out.println("sum of odd number is :" + sum);

  }
}
