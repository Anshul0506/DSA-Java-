class SelectionSort {
  public static void printarray(int a[]) {
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }

  public static void main(String[]args)
  {
    int a[]={5,2,1,4,3};
    int l=a.length;

    for(int i=0;i<l-1;i++)
    {
      int s=i;
      for(int j=i+1;j<l;j++)
      {
        if(a[s]>a[j])
        {
          s=j;
        }
      }
      int temp = a[s];
      a[s]=a[i];
      a[i]=temp;
    }
    printarray(a);
  }
}
