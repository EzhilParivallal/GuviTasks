package JavaProblemSolving;
import java.util.Scanner;
public class task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please Enter Year : ");
		int yr = myobj.nextInt();
		if (yr%400==0||((yr%4==0)&&(yr%100!=0)))
        {
             System.out.println("Entered year is a Leap year");
        }
        else
        {
        	System.out.println("Entered year is not a Leap year");
        }

	}

}
