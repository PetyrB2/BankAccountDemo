package BankAccount;

public class BankAccount {

	private String owner;
	private int balance;
	
	public BankAccount(String owner) {
		this(owner, 0);
	}// end owner

	
	public BankAccount(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
		
	}//end owner & balance

	public void Deposit(int amount) {
		if(amount > 0 ){
			balance += amount;
		}
		else {
			System.out.println("Amount to deposit must be greater than 0");
		}//end if-else statement
	}//end deposit
	
	
	public void Withdraw(int amount) {
		if(amount > 0 && amount <= balance){
			balance -= amount; // balance = balance - amount 
		}
		else {
			System.out.println("Amount to withdraw must be greater than 0"
					+ " and less than your balance");
		}//end if-else statement
	}//end withdraw
	
	public int getBalance() {
		return balance;
	}
	
	public String getOwner() {
		return owner;
	}
}//end BankAcct
