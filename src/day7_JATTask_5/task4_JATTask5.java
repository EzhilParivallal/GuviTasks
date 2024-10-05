package day7_JATTask_5;

import java.util.Scanner;

public class task4_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int i,j,k,n;
      Scanner myobj=new Scanner(System.in);
      System.out.println("Please enter the number of rows you want to print : ");
      n = myobj.nextInt();
      for(i=0;i<n/2;i++)
      {  
    	  for(j=0;j<i;j++)
    	  {
    		  
    		  System.out.print(" ");  
    	  }
    	  for(k=i;k<=n/2;k++)
    	  {
    		  if (k==i||k==n/2)
    		  {
    		  System.out.print("*"+" ");   
    		  }
    		  else
    		  {
    		  System.out.print(" "+" "); 
    		  }
    	  }
    	  System.out.println("");   
      }
      for (i= n/2; i>= 0; i--)  
      {  
      for (j=0; j<i; j++)  
      {  
      System.out.print(" ");  
      }  
      for (k=i; k<=n/2; k++)  
      {  
    	  if(k==i||k==n/2)
    	  {
           System.out.print("*" + " ");  
    	  }
    	  else
    	  {
    		System.out.print(" "+" ");  
    	  }
      }  
      System.out.println("");  
      }  
      myobj.close();  
	}

}
