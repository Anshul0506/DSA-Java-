class Problem1 {
  public static void main(String[] args) {
    int[] a = { 5, 4, 3, 2, 1 };
    int l = a.length;
    int min = a[0];
    int max = a[0];
    for (int i = 0; i < l; i++) {
      if (min > a[i]) {
        min = a[i];
      }
      if (max < a[i]) {
        max = a[i];
      }
    }
    System.out.println("Minimum number in array is = " + min);
    System.out.println("Maximum number in array is = " + max);
  }
}