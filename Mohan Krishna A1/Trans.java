public class Trans
{
 public static void main(String[] args) 
 {
  int [][] a={{10,20,30},{40,50,60}};
  System.out.println("original array :");
  for(int i=0;i<a.length;i++)
   {
    for(int j=0;j<a[0].length;j++)
   {
    System.out.print(a[i][j]+" ");
     }
    System.out.println();
   }
  System.out.println("After changing the rows and columns of the said array:");
  for(int j=0;j<a[0].length;j++) 
  {
    for(int i=0;i<a.length;i++)
   {
     System.out.print(a[i][j]+" ");
    }
    
    System.out.println();
		
   }
	
  }
}
