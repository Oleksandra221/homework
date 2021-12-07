package homework8;

import java.util.Scanner;

public class Account {
	int number_account; 
	private Operations op = new Operations();
	double balance;
	Scanner in = new Scanner(System.in);
	
	
	public int getNumber_account() {
		return number_account;
	}
	public void setNumber_account(int number_account) {
		this.number_account = number_account;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int displayOptions() {
		System.out.println("What do you want to do?\n"
				+ "1. To check the account.\n "
				+ "2. To withdraw money.\n"
				+ "3. To deposit the account.\n"
				+ "4.To transfer the money." );
		int option = Integer.parseInt(in.nextLine());
		return option;
	}
	
	public double getAmount() {
		System.out.println("Write down the amount you want to withdraw/deposit/transfer.");
		double amount = Double.parseDouble(in.nextLine());
		return amount;
	}
	
	public void chooseOption(int option,  Account account) {
		double amount;
		switch(option) {
		case(1):{
			op.check();
			break;
		}
		case(2):{
			amount = getAmount();
			op.withdrawMoney(amount);
			break;
		}
		case(3):{
			amount = getAmount();
			op.deposit(amount);
			break;
		}
		case(4):{
			amount = getAmount();
			op.transfer(amount, account);
			break;
		}
		}
	}
	
	public class Operations{
		
		
		public void withdrawMoney(double amount) {
			balance -= amount;
			System.out.println("The amount of  was withdrawed.");
		}
		
		public void deposit(double amount) {
			balance+=amount;
			System.out.println("Account was deposited.");
		}
		
		public void transfer(double amount, Account account) {
			balance-=amount;
			account.balance += amount;
			System.out.println("Money was transfered to account: " + account.number_account);
		}
		
		public void check() {
			System.out.println("Account: " + number_account + "\n"
					+ "Balance: " + balance );
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account();
		Account account2 = new Account();
		
		account1.setBalance(10000.0);
		account2.setBalance(0.0);
		
		account1.setNumber_account(123456789);
		account2.setNumber_account(987654321);
		for (int i = 1; i < 2; i++) {
			int option = account1.displayOptions();
			account1.chooseOption(option, account2);
		}
		System.out.println(account2.getBalance());
		
		
}

}
