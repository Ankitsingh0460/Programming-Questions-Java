class MinMaxArray {
  public static void main(String[] args) {
    int[] array = utilityInput.inputarray();

    int min = min(array);
    System.out.println("minimum number is : " + min);
    int max = max(array);
    System.out.print("maximum number is : " + max);

  }

  private static int min(int[] array) {
    int min = Integer.MAX_VALUE;
    int i = 0;
    while (i < array.length) {
      if (min > array[i]) {
        min = array[i];
      }
      i++;
    }
    return min;
  }

  private static int max(int[] array) {
    if (array.length == 0) {
      return Integer.MIN_VALUE;
    }
    int max = array[0];
    int i = 1;
    while (i < array.length) {
      if (max < array[i]) {
        max = array[i];
      }
      i++;
    }
    return max;
  }

}
