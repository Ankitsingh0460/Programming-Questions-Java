import java.util.Scanner;

class MirrorRightPattern {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int num = input.nextInt();

    for (int i = 1; i <= num; i++) {
      for (int j = num - 1; j >= i; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }

  }
}
