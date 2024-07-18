import java.util.Scanner;

class EvenNumber {

  public static void main(String[] args) {
    int n;
    int count = 0;
    System.out.print("Enter Number ");
    Scanner r = new Scanner(System.in);
    n = r.nextInt();

    for (int i = 0; i <= n; i = i + 2) {
      System.out.println(i + " ");
      count++;
    }
    System.out.print("total even number are :" + count);
  }
}
