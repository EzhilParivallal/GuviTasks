package JavaProblemSolving;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the string to reverse : ");
		String st = myobj.nextLine();
		String rev = "";
		for (int i=st.length()-1;i>=0;i--)
		{
			rev = rev+st.charAt(i);
		}
		System.out.println("Reversed String : "+rev);

	}

}
