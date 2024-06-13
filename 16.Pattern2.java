import java.util.Scanner;

class PatternDownwardTriangle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number");
    int num = input.nextInt();

    for (int i = num; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
