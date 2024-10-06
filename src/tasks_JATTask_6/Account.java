package tasks_JATTask_6;

public class Account {
    private int debitAmt;
    private int creditAmt;
    private int balance;
    Account(){
    	
    }
    Account(int debitAmt,int creditAmt,int balance){
    	this.debitAmt=debitAmt;
    	this.creditAmt=creditAmt;
    	this.balance=balance;
    }
    public int withdraw() {
    	balance = balance-debitAmt;
    	System.out.println("Amount withdrawn : "+debitAmt);
    	return balance;
    }
    public int deposit() {
    	balance = balance+creditAmt;
    	System.out.println("Amount deposited : "+creditAmt);
    	return balance;
    }
    public String toString() {
    	return "Account balance  : "+balance;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Account obj=new Account(100,0,10000);
        Account obj1=new Account(0,2000,10000);
        obj.withdraw();
        System.out.println(obj);
        obj1.deposit();
        System.out.println(obj1);
	}

}
