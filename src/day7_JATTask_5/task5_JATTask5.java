package day7_JATTask_5;

import java.util.Scanner;

public class task5_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please Enter your Mark : ");
		int mark = myobj.nextInt();
        char grade;
        if (mark>100||mark<0)
        {
        	System.out.println("Mark entered is Invalid");
        }
        else {
		if(mark==100)
		{
			grade='S';
		}
		else if (mark<100&&mark>89)
		{
			grade='A';
		}
		else if (mark<90&&mark>79)
		{
			grade='B';
		}
		else if (mark<80&&mark>69)
		{
			grade='C';
		}
		else if (mark<70&&mark>59)
		{
			grade='D';
		}
		else if (mark<60&&mark>49)
		{
			grade = 'E';
		}
		else
		{
			grade = 'F';
		}
		System.out.println("Grade respective to the Mark : "+grade);
        }
	}

}
