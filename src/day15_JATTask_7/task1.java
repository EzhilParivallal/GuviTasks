package day15_JATTask_7;

import java.util.Scanner;

public class task1 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter number A: ");
		a=myobj.nextInt();
		System.out.println("Please enter number B: ");
		b=myobj.nextInt();
		try {
		int c=a/b;
		System.out.println("A/B : "+c);
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter valid number to divide");
		}
		

	}

}
