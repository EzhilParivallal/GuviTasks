package day2_Java;

import java.util.Scanner;

public class JATTask4_4 {

	public static void main(String[] args) {
		int a;
		// TODO Auto-generated method stub
		int b;
    Scanner myobj = new Scanner(System.in);
    System.out.println("Enter Value of A: ");
    a = myobj.nextInt();
    System.out.println("Enter Value of B: ");
    b = myobj.nextInt();
    int A = a, B=b;
    a=B; b=A;
    System.out.println("The Value of A after swapping : "+ a);
    System.out.println("The Value of B after swapping : "+ b);
    
	}

}
