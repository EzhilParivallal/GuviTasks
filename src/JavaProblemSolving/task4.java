package JavaProblemSolving;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;
        for(i=1;i<=100;i++)
        {
        	if(i%3==0&&i%5==0)
        	{
        		System.out.println("FizzBuzz");
        	}
        	else if(i%3==0)
        	{
        		System.out.println("Fizz");
        	}
        	else if(i%5==0)
        	{
        		System.out.println("Buzz");
        	}
        	else
        	{
        		System.out.println(i);
        	}
        }
	}

}
