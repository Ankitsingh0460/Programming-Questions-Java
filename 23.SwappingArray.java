class SwappingArray {
  public static void main(String[] args) {
    int[] array = utilityInput.inputarray();

    reserve(array);
    int arrays = printarray(array);

  }

  public static void reserve(int[] array) {
    int i = 0;

    while (i < array.length / 2) {
      int swap = array[i];
      array[i] = array[(array.length - 1) - i];
      array[(array.length - 1) - i] = swap;

      i++;

    }
  }

  public static int printarray(int[] array) {
    int i = 0;
    while (i < array.length) {
      System.out.println(array[i]);

      i++;

    }
    return array[i];
  }
}
