package day7_JATTask_5;

import java.util.Scanner;

public class task1_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String for Palindrom check : ");
		String st = scanner.nextLine();
		st = st.toLowerCase();
		String rev = "",st1 = "";
		//to remove spaces
		for (int i = 0;i<=st.length()-1;i++)
		{
			char c = st.charAt(i);
			if (Character.isWhitespace(c)) 
			{		
			}
			else
			{
			st1 = st1+st.charAt(i);
			}
		}
		for (int j = st1.length()-1;j>=0;j--)
		{
			rev = rev+st1.charAt(j);
		}
        if (st1.equals(rev))
        {
        	System.out.println("Entered string is a palindrome");
        }
        else
        {
        	System.out.println("Entered string is not a palindrome");
        }
	}


	}


