package day2_Java;

import java.util.Scanner;
public class JATTask4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Please Enter the value of a: ");
		a = myobj.nextInt();
		System.out.println("Please Enter the value of b: ");
		b = myobj.nextInt();
		System.out.println("Please Enter the value of c: ");
		c = myobj.nextInt();
		System.out.println("Please Enter the value of d: ");
		d = myobj.nextInt();
		int e=a+b, f=c+d;
		if (e>f)
		{
			System.out.println("Sum of a and b > Sum of c and d");
		}
		else if (f>e)
		{
			System.out.println("Sum of a and b < Sum of c and d");
		}
		else
		{
			System.out.println("Sum of a and b = Sum of c and d");
		}

	}

}
