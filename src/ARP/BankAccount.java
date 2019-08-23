package ARP;

public class BankAccount {
	private String accountNumber;
	private double totalBalance;
	CheckingAccount checkingAccount;
	SavingAccount savingAccount;

	public BankAccount(String accountNumber, double totalBalance, CheckingAccount checkingAccount,
			SavingAccount savingAccount) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
		this.checkingAccount = checkingAccount;
		this.savingAccount = savingAccount;
	}

	private double diposit() {
		return 0;
	}

	private double withdraw() {
		return 0;
	}

	public double checkBalance() {
		return totalBalance;
	}

	public void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Deduced Fee: " + checkingAccount.deduceFee());
		System.out.println("Added Interest : " + savingAccount.addInterest());
		System.out.println("Current Balance : " + this.checkBalance());
	}

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount(90.00);
		SavingAccount savingAccount = new SavingAccount(15.00);
		BankAccount bankAccount = new BankAccount("52299", 500000.00, checkingAccount, savingAccount);
		bankAccount.diposit();
		bankAccount.withdraw();
		bankAccount.checkBalance();
		bankAccount.display();

	}

}
