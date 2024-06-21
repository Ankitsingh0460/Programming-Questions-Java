import java.util.Scanner;

class CheckOccurencesInArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = utilityInput.inputarray();
    System.out.print("enter number which u waant to find: ");
    int number = input.nextInt();
    int count = checkcount(number, array);
    System.out.print(count);
  }

  public static int checkcount(int num, int[] array) {
    int i = 0;
    int count = 0;
    for (i = 0; i < array.length; i++) {
      if (num == array[i]) {
        count++;
      }
    }
    return count;
  }
}
