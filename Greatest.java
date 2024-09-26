/*Assignment 8: Determine the Greatest Number Using Ternary Operator

Write a Java program to find the greatest number among three numbers using the ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers*/

package module4;
import java.util.Scanner;
public class Greatest {
	Scanner obj=new Scanner(System.in);
	private int n1;
	private int n2;
	private int n3;
	private int greatest;
	
	public void accept()
	{
		System.out.println("Enter number one..");
		n1=obj.nextInt();
		System.out.println("Enter number two..");
		n2=obj.nextInt();
		System.out.println("Enter number three..");
		n3=obj.nextInt();
		
	}
	public void checkgreater()
	{
		greatest = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n1 && n2 >= n3) ? n2 : n3;
	}
	void display()
	{
		System.out.println("the greatest no is"+greatest);
	}
	

}
