import java.util.Scanner;
public class boolq
{
 public static void main(String[] args) 
 {
  boolean[][] a={{true, false, true},{false, true, false}};
  int rl=a.length;
  int cl=a[0].length;
  for (int i=0;i<rl;i++) 
  {
   for (int j=0;j<cl;j++) 
   {
    if (a[i][j]) 
    {
     System.out.print(" t ");
     } 
    else 
   {
    System.out.print(" f ");
    }
				
   }
  System.out.println();
  }	
 
 }
}