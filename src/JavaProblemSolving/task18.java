package JavaProblemSolving;

import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the String : ");
		String st1 = myobj.nextLine();
		st1 = st1.toLowerCase();
		char ch1[] = st1.toCharArray();
		int n=ch1.length;
		char ch2[] = new char[n];
		Boolean unique1=true;
		int k=0;
        for(int i=0;i<ch1.length;i++)
        {
        	for(int j=i+1;j<ch1.length;j++)
        	{
        		if (ch1[i]==ch1[j])
        				{
        			   unique1 = false;
        			   break;
        		       }
        	}
        	if (unique1==true)
        	{
        		if(ch1[i]!=0)
        		{
        		ch2[k] = ch1[i];
			     k++;
        		}
        	}
        	unique1=true;
        }
        System.out.println("Frequency of Characters in the entered String : ");
        int count;
		for (int i=0;i<ch2.length;i++)
		{
			if(ch2[i]==0)
			{
				break;
			}
			else
			{
			System.out.print(ch2[i]+" : ");
			count =0;
			for(int j=0;j<ch1.length;j++)
			{
				if(ch2[i]==ch1[j])
				{
					count=count+1;
				}
			}
			System.out.print(count+"   ");
			}
			
		}

	}

}
