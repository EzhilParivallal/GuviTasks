package JavaProblemSolving;
import java.util.Scanner;
public class task15 {

	public static <Int> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
	    System.out.println("Please enter the value of n : ");
	    int n=myobj.nextInt();
	    int arr[] = new int[n+1];
	    arr[0]=1;
	    arr[1]=3;
	    arr[2]=6;
	    arr[3]=7;
	    arr[4]=8;
	    arr[5]=9;
	    int j=0;
		System.out.println("Missing numbers : ");
		Boolean noMissNum = false;
		for(int i=1;i<=n;i++)
		{
          for(j=0;j<=n;j++)
          {
			if(arr[j]==i)
			{
			noMissNum = true;
			}
		}
          if (noMissNum==true)
          {
        	  noMissNum=false;
          }
          else
          {
        	  System.out.print(i+" ");
          }
		}
	}

}
