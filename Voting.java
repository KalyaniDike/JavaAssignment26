/*Assignment 4: Voting Eligibility
Write a program that checks if a person is eligible to vote. A person can vote if they are a 
citizen and their age 
is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions if necessary.*/

package module4;
import java.util.Scanner;
public class Voting {
	Scanner obj=new Scanner(System.in);
	private int age;
	private boolean citizen;
	
	 public void accept()
	 {
		 System.out.println("Enter age..");
		 age=obj.nextInt();
		 System.out.println("\"Are you a citizen? (true/false):");
		 citizen=obj.nextBoolean();
		
	 }
	 public void checkage()
	 {
		 if(age>=18 && citizen)
		 {
			 System.out.println("A person is eligible for voting..");
		 }
		 else
		 {
			 System.out.println("person is not eligible");
		 }
	 }
	 void display()
	 {
		 System.out.println("age"+age);
		 System.out.println("Citizen: " + citizen);
	 }
	
}
