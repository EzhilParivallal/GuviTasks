package JavaProblemSolving;

import java.util.Scanner;

public class task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the string : ");
		String st1 = myobj.nextLine();
		String st="";
		for(int i=0;i<st1.length();i++)
		{
			if (st1.charAt(i)!=' ')
			{
				st = st+st1.charAt(i);
			}
		}
		System.out.println("String after removing white spaces : "+st);

	}

}
