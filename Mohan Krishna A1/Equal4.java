import java.util.Scanner;
public class Equal4 
{
 public static void main(String[] args) 
 {
  Scanner x = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int n1 = x.nextInt();
  System.out.print("Enter second number: ");
  int n2 = x.nextInt();
  System.out.print("Enter third number: ");
  int n3 = x.nextInt();
  System.out.print("Enter fourth number: ");
  int n4 = x.nextInt();	//took 4 user inputs	
  if ((n1==n2)&&(n2==n3)&&(n3==n4)) 
   {
    System.out.println("Numbers are equal.");
    }
   else
   {
    System.out.println("Numbers are not equal!");
    }
  }
}
   