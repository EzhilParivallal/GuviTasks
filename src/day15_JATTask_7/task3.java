package day15_JATTask_7;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the Age: ");
		int age =myobj.nextInt();
		if (age<18) {
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else {
			System.out.println("Age is valid to vote");
		}
		

	}

}
