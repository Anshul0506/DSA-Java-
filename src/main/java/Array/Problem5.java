//The cumulative sum of an array at index i

//Cumulative sum = "The cumulative sum of an array at index i is the sum of all the elements of the array from index 0 to index i".

class Problem5 {
  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 4, 5 };
    int sum = 0;
    System.out.println("Cumulative sum of array is ");
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
      System.out.println(sum);

    }

  }
}