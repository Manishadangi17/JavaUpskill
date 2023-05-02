package com.ThridDay;

public class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        return this.accountNumber;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        this.balance += amount;
    }
    
    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
        }
    }

	public static void main(String argas[]) {
		BankAccount account = new BankAccount("123456789", 1000.0);
		System.out.println(account.getBalance()); 
		account.deposit(500.0);
		System.out.println(account.getBalance()); 
		account.withdraw(2000.0); 
		System.out.println(account.getBalance()); 
		account.withdraw(1000.0);
		System.out.println(account.getBalance()); 

	}
}
