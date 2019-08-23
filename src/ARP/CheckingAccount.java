package ARP;

public class CheckingAccount {
	private double fee;

	public CheckingAccount(double fee) {
		this.fee = fee;
	}

	public double deduceFee() {
		return fee;
	}
}
