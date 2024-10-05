package JavaProblemSolving;
import java.util.Scanner;
public class task5 {
	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("Please enter the String : ");
		String st = myobj.nextLine();
		st = st.toLowerCase();
		int vowels=0,consonants=0;
		char ch;
		for(int i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
		}
		System.out.println("Number of vowels in the entered word : "+vowels);
		System.out.println("Number of consonants in the entered word : "+consonants);

	}

}
