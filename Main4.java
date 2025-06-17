import java.util.*;
public class Main4
{
	public static void main(String [] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int [] a=new int[5];
	   int flag=1;
	   for(int i=0;i<a.length;i++)
	   {
	      a[i] =sc.nextInt();
	   }
	  int n=sc.nextInt();
	   for(int i=0;i<a.length;i++)
	   {
	 if (a[i]==n)
	 {
	System.out.println("element if found in index" +i);
	flag=0;
	break;
	   }
	   }
	   if(flag==1)
	   {
	       System.out.println("not found");
	   }
}
}

