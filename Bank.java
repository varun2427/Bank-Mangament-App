package bankapp;

public class Bank {
	
	//customers list
	//int[] array = new int[10];
	//char[] chars = new char[10];
	

	private static int custCount;
	private Customer[] customers= new Customer[10];
	
	public void addCustomer(Customer newCustomer) {
		 customers[custCount]=newCustomer;
		 custCount++;
	}
	public static int  getCustCount() {
		return custCount;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomerByID(long cID) {
		for(int i=0;i<getCustCount();i++)
			if(customers[i].getCustID()==cID) {
				return customers[i];
			}
	return null;
	}	
}

