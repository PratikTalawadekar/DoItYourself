import java.util.*;
class Seven{
    public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  if(n>0)
	  {
	  System.out.println("The Given number "+n+" is positive");
	  }
	  else if(n<0)
	  {
	   System.out.println("The Given number "+n+" is negative");
	  }
	  else
	  {
	  System.out.println("The Given number "+n+" is neither positive nor negative");
	  }
	  
	}
}