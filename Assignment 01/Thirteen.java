import java.util.*;
public class Thirteen
{
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first number");
         int a = sc.nextInt();
         System.out.println("Enter the second number");
         int b = sc.nextInt();
         System.out.println("Enter the third number");
         int c = sc.nextInt();
         
         int smaller = a>b?b:a;
         int smallest = c<smaller ? c:smaller;
         System.out.println("The smallest number is "+smallest);
	}
}