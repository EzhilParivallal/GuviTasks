package day7_JATTask_5;

import java.util.Scanner;

public class task6_JATTask5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner myobj=new Scanner(System.in);
     System.out.println("Enter the number of the month : ");
     int month = myobj.nextInt();
     System.out.println("Enter the room rent per day   : ");
     float rent = myobj.nextFloat();
     System.out.println("Enter the no. of days stayed  : ");
     int days = myobj.nextInt();
     Boolean invalidMon=false;
     double amount;
     switch(month){
    	 case 1,2,3:
    		 rent = rent;
    	     break;
    	 case 4,5,6:
    		 rent = (float) (rent + (0.2*rent));
    	     break;
    	 case 7,8,9,10:
    		  rent = rent;
    	      break;
    	 case 11,12:
    		  rent = (float) (rent + (0.2*rent));
	          break; 
	     default:
	    	 System.out.println("Enter valid month");
	    	 invalidMon=true;
    		 
     }
     if(invalidMon==true) {
    	 System.out.println("Please enter valid month");
     }
     else if(rent<=0)
     {
    	 System.out.println("Please enter valid rent");
     }
     else if (days<=0)
     {
    	 System.out.println("Please enter valid no. of days");
     }
     else
     {
    	 amount = rent*days;
    	 System.out.println("Amount to be paid : "+String.format("%.2f", amount));
     }
     
	}

}
