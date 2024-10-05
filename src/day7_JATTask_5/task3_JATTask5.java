package day7_JATTask_5;

import java.util.Scanner;

public class task3_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = myobj.nextInt();
        int printNum = 0;
        for(int i=1;i<=num;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		
        		printNum = printNum + 1;
        		System.out.print(printNum+" ");
        		
        		
        	}
        	System.out.println();
        }
	}

}
