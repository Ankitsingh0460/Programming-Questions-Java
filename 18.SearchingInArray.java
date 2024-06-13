import java.util.Scanner;

class Array {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number to serarch");
    int num = input.nextInt();

    int[] mynum = { 20, 40, 66, 33, 44, 55, 823, 55, 67, 34, 26, 46, 46, 76, 34, 553, 68, 98 };
    boolean searchFuncton = searchFuncton(mynum, num);
    if (searchFuncton) {
      System.out.println("Number is valid");
    } else {
      System.out.println("not found");
    }
  }

  public static boolean searchFuncton(int[] arr, int number) {
    int i = 0;
    while (i < arr.length) {
      if (arr[i] == number) {
        return true;
      }
      i++;
    }
    return false;
  }
}
