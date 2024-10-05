package day2_Java;

import java.util.Scanner;

public class JATTask4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long num,num1;
        int count=0;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        num = myobj.nextInt();
        num1 = num;
        while(num != 0){
            num = num / 10;
            count++;
         }
        System.out.println("The number of digits in " +num1+" is "+count);
	}

}
