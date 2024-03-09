// Find out the occurrence of an integer in the array 

class Problem8
{
  public static void main(String[]args)
  {
    int a[]= {1,1,2,5,3,2,5,6,3,7,6,9,5,8,5,6,6};
    int l=a.length;
    // x is the integer for calculating it's occurrence
    int x=5;
    int r=0;
    for(int i=0;i<l;i++)
    {
      if(x==a[i])
      {
        r=r+1;
      }
    }
    System.out.println("The Number "+x+" is repeating "+r+" time in array");
  }
}
