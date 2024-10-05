package day2_Java;

import java.util.Scanner;

public class JATTask4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner myobj = new Scanner(System.in);
    System.out.println("Please enter the number : ");
    int num = myobj.nextInt();
    int fact=1;
    for (int i = 1; i<=num;i++)
    {
    	fact = fact*i;
    }
    System.out.println("Factorial of "+num+" is "+fact);
	}

}
