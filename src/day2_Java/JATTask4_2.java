package day2_Java;

import java.util.Scanner;

public class JATTask4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner myobj = new Scanner(System.in);
        System.out.println("Please Enter value of a: ");
        a = myobj.nextInt();
        if (a>0) {
           if (a%2==0)
           {
    	    System.out.println("Number a is even");
           }
           else
           {
    	    System.out.println("Number a is odd");
           }
       }
       else
       {
    	System.out.println("Please enter a valid number");
       }
	}

}
