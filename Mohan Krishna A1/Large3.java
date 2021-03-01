import java.util.Arrays;
public class Large3
{
 public static void main(String[] args) 
 {
  int []a={1, 4, 17, 7, 25, 3, 100};
  System.out.println("Original array:");
  for(int i=0;i<a.length;i++)
   {
    System.out.print(a[i]+" ");
   }
  Arrays.sort(a);
  System.out.println();
  System.out.println("3 largest elements of the said array are:");
   for(int i=a.length-1;i>=a.length-3;i--)
   {
    System.out.print(a[i]+" ");
   }

  }
}
