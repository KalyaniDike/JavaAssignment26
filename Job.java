/*
 Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications.
 A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a 
 clean criminal record.
Requirements:
•    Use logical operators to combine conditions.
 */
package module4;
import java.util.Scanner;
public class Job {
	private boolean isDegree;
	private boolean isExperience;
	private boolean isCriminalRecord;
	Scanner sc=new Scanner(System.in);

	

	public void accept()

	{

		System.out.println("you will complete Bachlors degree");

		isDegree=sc.nextBoolean();

		System.out.println("you have an experience");

		isExperience=sc.nextBoolean();

		System.out.println("your criminal record is clear");

		isCriminalRecord=sc.nextBoolean();

	}

	public void checkEligibility()

	{

		if((isDegree==true || isExperience==true)&&(isCriminalRecord==true))

			System.out.println("person is eligible for job");

		else

			System.out.println("Person is not eligible for job");

	

	}

}









