import java.util.Scanner;

public class utilityInput {
  public static int[] inputarray() {
    Scanner input = new Scanner(System.in);
    System.out.print("enter size of array :");
    int size = input.nextInt();

    int[] arr = new int[size];
    int i = 0;
    while (i < size) {
      System.out.print("Enter element number" + i + ":");
      arr[i] = input.nextInt();
      i++;
    }
    return arr;
  }
}