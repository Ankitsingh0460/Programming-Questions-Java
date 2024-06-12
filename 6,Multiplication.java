import java.util.Scanner;

class Multiplication {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number for Multiplication");
    int num = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      int multi = num * i;
      System.out.println(num + "X" + i + "=" + multi);

    }

  }

}
