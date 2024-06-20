import java.util.Scanner;

class SumAvgInArray {
  public static void main(String[] args) {

    int[] arr = { 1, 4, 64, 4, 3, 6, 53, 4, 5, 5, 5, };

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          System.out.println(arr[j]);
        }
      }

    }

  }

}
