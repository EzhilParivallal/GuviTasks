package JavaProblemSolving;
import java.util.Scanner;
public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Please enter the number : ");
	    int num = myobj.nextInt();
	    int fact=0;
	    fact = (int) factorial(num);
	    System.out.println("Factorial of "+num+" is "+fact);
	}
	static long factorial(int num)
	{
		if (num>=1)
		{
			return num*factorial(num-1);
		}
		else
		{
			return 1;
		}
	}

}
