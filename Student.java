/*Assignment 8: Determine the Greatest Number Using Ternary Operator

Write a Java program to find the greatest number among three numbers using the 
ternary operator.

*Input: Three integer numbers from the user.
*Output: The greatest number among the three entered numbers.*/package module4;


import java.util.Scanner;

public class Student {

	Scanner obj=new Scanner(System.in);

	

	private int s1;

	private int s2;

	private int s3;

	private double average; 

	

	public void accept()

	{

		System.out.println("Enter marks of s1..");

		s1=obj.nextInt();

		System.out.println("Enter marks of s2..");

		s2=obj.nextInt();

		System.out.println("Enter marks of s3..");

		s3=obj.nextInt();

	}

	public void checkscore()

	{

		if(average>=60 && s1>40 && s2>40 && s3>40)

		{

			System.out.println("A student is passed...");

		}

		else

		{

			System.out.println("A student is failed...");

		}

	}

	public void checkaverage()

	{

		average=(s1+s2+s3)/3;

		System.out.println("average.."+average);

	}

	void display()

	{

		System.out.println("s1.."+s1);

		System.out.println("s2.."+s2);

		System.out.println("s3.."+s3);

		

	}

	

}










