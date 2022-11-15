package BankAccount;

public class BankAccountDemo {

	public static void main(String[] args) {

		// Make Accounts
		BankAccount myAccount  = new BankAccount("Peter B", 150000);
		BankAccount nicsAccount  = new BankAccount("Nichola Sutton", 250);
	
		// Check Balance on Nics Account
		System.out.println("Account Name: " + nicsAccount.getOwner());
		System.out.println("Balance: " + nicsAccount.getBalance());
		System.out.println("");
		
		nicsAccount.Deposit(500); // Deposit 
		System.out.println("Account Name: " + nicsAccount.getOwner());
		System.out.println("Balance: " + nicsAccount.getBalance());
		System.out.println("");
		
		nicsAccount.Withdraw(1000); // Trigger Warning !!
		System.out.println("Account Name: " + nicsAccount.getOwner());
		System.out.println("Balance: " + nicsAccount.getBalance());
		System.out.println("");
		
		// My Account
		
		System.out.println("Account Name: " + myAccount.getOwner());
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println("");
		
		myAccount.Deposit(750); // Deposit 
		System.out.println("Account Name: " + myAccount.getOwner());
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println("");
		
		myAccount.Withdraw(750); // Withdraw 
		System.out.println("Account Name: " + myAccount.getOwner());
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println("");
		
	}

}
