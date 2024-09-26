/*Assignment 1: Validating Age and Income

Write a program that checks if a person is eligible for a loan based on their age and income.

Requirements:

•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.

•    Use logical && to combine these conditions.*/
package module4;
import java.util.Scanner;
public class Person {
	Scanner obj=new Scanner(System.in);

	private int age;

	private double income;

	

	public void accept()

	{

	System.out.println("Enter age of person..");

	age=obj.nextInt();

	System.out.println("Enter income of person..");

	income=obj.nextInt();

	}

	public void checkage()

	{

		if((age>=18 && age<=60) && (income>=25000))

		{

		     System.out.println("A person is eligible...");

		}

		else

		{

			System.out.println("A person is not eligible");

		}

	}

	void display()

	{

		System.out.println("age :"+age);

		System.out.println("income is:"+income);

	}

	

}
