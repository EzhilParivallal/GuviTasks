package day2_Java;

import java.util.Scanner;

public class JATTask4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the age of Employee: ");
		age = myobj.nextInt();
		if (age>60)
		{
			System.out.println("Employee is a senior citizen");
		}
		else
		{
			System.out.println("Employee is not a senior citizen");
		}
	}
}
