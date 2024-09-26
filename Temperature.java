/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside
based on temperature and weather conditions. The conditions to
go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !*/
package module4;
import java.util.Scanner;
public class Temperature {
	Scanner sc = new Scanner (System.in);
	private int temp;
private int flag=0;
	public void get() {
		System.out.println("Enter the temperture = ");
	temp=sc.nextInt();
	}
	void check() {
		if((temp>=20) && (temp<=30)) {
			System.out.println("weather is safe");
			flag=1;
		}
		else if (flag==1)
		 {
			System.out.println("It should not be raining.");
			
		}
		else {
			System.out.println("Wether is not good");
		}

}


}
