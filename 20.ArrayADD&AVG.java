class ArrayADDAVG {
  public static void main(String[] args) {
    int[] array = utilityInput.inputarray();
    long sum = sum(array);
    long avg = avg(array);

    System.out.println("sum is " + sum);
    System.out.print("average is " + avg);

  }

  public static long sum(int[] array) {
    int i = 0;
    int sum = 0;
    while (i < array.length) {
      sum = sum + array[i];
      i++;
    }
    return sum;
  }

  public static int avg(int[] array) {
    long sum = sum(array);
    return (int) sum / array.length;
  }
}
