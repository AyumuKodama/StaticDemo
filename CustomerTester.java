
public class CustomerTester {

	public static void main(String[] args) {
		// We can use a static method without creating any objects
		System.out.println("Calling a static method without any objects");
		System.out.println("$100 = " + Company.convertDollarsToEuros(100.0) + " euros");
		System.out.println(Customer.getNumberOfCustomers() + " customers so far");
		System.out.println();
		
		// Static class variables have the same value across all objects of that class.
		// You can access a class variable from any object of that class and it will
		// have the same value.
		System.out.println("Demonstration of static class variables");
		Customer cust1 = new Customer("IBM", 0.0);
		System.out.println("Total number of customers: " +cust1.getNumberOfCustomers());
		Customer cust2 = new Customer("Apple", 100.0);
		System.out.println("Total number of customers: " + cust1.getNumberOfCustomers());
		Customer cust3 = new Customer("Dell", -100.0);
		System.out.println("Total number of customers: " + cust1.getNumberOfCustomers());
	}
}
