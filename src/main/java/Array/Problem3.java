// Program to Sort the giver Array

class Problem3 {

  public static void main(String[] args) {
    int[] a = { 5, 2, 4, 1, 3 };
    int l = a.length;
    int temp = 0;
    for (int i = 0; i < l; i++) {
      for (int j = i + 1; j < l; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
      System.out.println(a[i]);
    }

  }
}