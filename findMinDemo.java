package array;
public class findMinDemo{
  static int findMin(int a[]){
  int min=a[0];
  for(int i=1;i<a.length;i++)
  
  {
    if (min>a[i])
    min=a[i];
   
  }
  return min;
}
public static void main(String[] args)
{
  int a[]={10,2,7,4,9};
  System.out.println("The max value is:"+findMin(a));
}
}
