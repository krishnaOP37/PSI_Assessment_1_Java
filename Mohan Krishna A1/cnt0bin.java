import java.util.Scanner;
 
public class cnt0bin
{
 public static void main(String[] args)
 {
  Scanner x=new Scanner(System.in);
  System.out.println("Input first number:");
  int n=x.nextInt();
  int c=0,i=0;
  int[] a=new int[8];
  while(n>0)
  {
   a[i++]=n%2;
   n=n/2;
  }
  System.out.println("Binary representation of 25 is:");
  for(int j=i-1;j>=0;j--)
  {
   System.out.print(a[j]);
   if(a[j]==0)
   {
    c++;
   }
  }
  System.out.println();
  System.out.println("Number of zero bits:"+c);
}
}