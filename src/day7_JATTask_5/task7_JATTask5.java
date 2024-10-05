package day7_JATTask_5;

import java.util.Arrays;
import java.util.Scanner;

public class task7_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[3];
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter Numbers: ");
		for (int i=0;i<3;i++)
		{
		arr[i] = myobj.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The largest number is "+arr[2]);
	}

}
