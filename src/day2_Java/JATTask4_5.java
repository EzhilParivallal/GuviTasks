package day2_Java;
import java.util.Scanner;
public class JATTask4_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		num = myobj.nextInt();
		int m = num/2,i = 2;
		boolean flag = false;
		if (num>1) {
			while (i<=m)
			{
				if(num%i==0)
				{
					flag=true;
					break;
				}
				++i;
			}
			
		}
		else if (num==0||num==1)
		{
			flag = true;
		}
		else
		{
			System.out.println("Please enter valid number");
		}
   if (num>=0)
   {
     if (flag == true)
     {
    	 System.out.println(num + " is not a prime number");
     }
     else
     {
    	 System.out.println(num + " is a prime number");
     }
   }
	}

}
