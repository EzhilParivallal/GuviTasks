package JavaProblemSolving;
import java.util.Arrays;
import java.util.Scanner;
public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner myobj = new Scanner(System.in);
      System.out.println("Please Enter first String : ");
      String st1 = myobj.nextLine();
      System.out.println("Please Enter second String : ");
      String st2 = myobj.nextLine();
      char ch1[] = st1.toCharArray();
      char ch2[] = st2.toCharArray();
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      if (Arrays.equals(ch1,ch2))
      {
    	  System.out.println("Entered strings are Anagram");
      }
      else
      {
    	  System.out.println("Entered strings are not Anagram");
      }
	}

}
