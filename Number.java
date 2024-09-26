/*Assignment 6: Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions.*/package module4;
import java.util.Scanner;
public class Number {
	private int num;
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter num:");
		num = sc.nextInt();
	}

	public void checkNum() {
		if (!(num >= 10 && num <= 20)) {
			System.out.println(+num + " is not between 10 and 20");
		} else
			System.out.println(+num + " is between 10 and 20");
	}


}