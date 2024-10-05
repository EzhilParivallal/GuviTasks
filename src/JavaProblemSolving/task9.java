package JavaProblemSolving;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the number : ");
		int num = myobj.nextInt();
		int rem=0,sum=0;
		while(num>0)
		{
			rem = num%10;
			sum =sum+rem;
			num = num/10;
			
		}
		System.out.println("The sum of digits in the entered number : "+sum);

	}

}
