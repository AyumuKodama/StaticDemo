
public class Customer extends Company {
	
	private double outstandingBalance;
	private static int numberOfCustomers = 0;
	
	public Customer(String companyName, double outstandingBalance) {
		super(companyName);
		this.outstandingBalance = outstandingBalance;
		numberOfCustomers++;
	}
	
	public static int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public double getOutstandingBalance() {
		return outstandingBalance;
	}

}
