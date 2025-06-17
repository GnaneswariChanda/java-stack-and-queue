import java.util.*;
public class Main5
{
	public static void main(String [] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int [] a=new int[5];
	  int [] b=new int[a.length];
	   for(int i=0;i<a.length;i++)
	   {
	      a[i] =sc.nextInt();
	   }
	  
	   for(int i=0;i<a.length;i++)
	   {
	 b[i]=a[i];
          System.out.println(b[i]);
      }
}
}