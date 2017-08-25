
public class Company {
	
	private String companyName;
	
	public Company(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public static double convertDollarsToEuros(double dollars) {
		double exchangeRate = 0.85;
		return dollars * exchangeRate;
	}

}
