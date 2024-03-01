package array;
public class findMaxDemo{
  static int findMax(int a[]){
  int max=a[0];
  for(int i=1;i<a.length;i++)

  {
    if (max<a[i])
    max=a[i];
   
  }
  return max;
}
public static void main(String[] args)
{
  int a[]={10,2,7,4,9};
  System.out.println("The max value is:"+findMax(a));
}
}
