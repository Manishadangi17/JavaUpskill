package OOPsConcept;
class BankAccount{
	private int account_no;
	private double balance;
	private String account_holder;
	public BankAccount(int account_no, double balance, String account_holder) {
		super();
		this.account_no = account_no;
		this.balance = balance;
		this.account_holder = account_holder;
	}
	
	public void deposit(double amount) {
		
		balance += amount;
			System.out.print(amount+ " deposited successfully");
	}
	public void withdrawal(double amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.print(balance+ " withdrawn successfully");
		} else {
			System.out.println(" balance is Insufficient in your account");
		}
		
	}
	 public boolean isBalanceBelowLimit(double limit) {
	        return balance < limit;
	    }
	 


public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}



public class Bank {
	public static void main(String args[]) {
		
		BankAccount bankamount =  new BankAccount(7653, 234566,"Mahi");
		
		bankamount.deposit(800);
		System.out.println("New balance: " + bankamount.getBalance());
		
		bankamount.withdrawal(980);
		 System.out.println("New balance: " + bankamount.getBalance());
		 
		 boolean isBelowLimit = bankamount.isBalanceBelowLimit(1000);
	        System.out.println("Is balance below limit? " + isBelowLimit);
	
	}
}}


