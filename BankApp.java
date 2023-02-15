package bankapp;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		   Bank b1 = new Bank();
		int options = 0;
		do {
			Scanner sc = new Scanner (System.in);
			System.out.println(" 1.Add a Customer\n 2.Display all Customers\n 3.Display Customer by ID\n 4.Display number of Customers\n 5.credit[deposit]\n 6.debit[withdraw]\n 7.exit");
			options = sc.nextInt();
			sc.nextLine();
		switch (options) {
		case 1 : System.out.println("enter your first name : ");
		         String fname = sc.nextLine();
		         System.out.println("enter your last name : ");
		         String lname = sc.nextLine();
		         System.out.println("enter your address : ");
		         String ad = sc.nextLine();
		         System.out.println("enter your account number");
		         String accno = sc.next();
		         System.out.println("enter your account name");
		         String accname = sc.nextLine();
		         Account a = new Account(accno , accname);
		         Customer c1 = new Customer(fname,lname,ad,a);
		         System.out.println("this customer is successfully added to my bank.");
		         break;
		case 2 : Customer[] custs = b1.getCustomers();
		           if(b1.getCustCount()==0) {
		        	   System.out.println("no customer in bank. add customer to veiw");
		           }else {
		             for (int i=0; i<b1.getCustCount();i++) {
			         System.out.println(custs[i]);
		             }
		           }
			     break;
		case 3 : System.out.println("enter the customer ID");
			      long cID= sc.nextInt();
			     System.out.println(b1.getCustomerByID(cID));
			     break;
		case 4:  System.out.println(b1.getCustCount());
			     break;
		case 5:  System.out.println("Enter your customer ID");
		 		 long custID= sc.nextLong();
				 System.out.println("enter the amount deposit");
				 int amount = sc.nextInt();
				 Customer c = b1.getCustomerByID(custID);
				 if (c!=null) {
					 Account depA = c.getAccount();
					 depA.credit(amount);
				 } else {
						 System.out.println("customer not found");
				 }
				 Account depA = c.getAccount();
				 depA.credit(amount);
				 System.out.println("successfully credited " + amount);
				 break;
		case 6:  System.out.println("Enter your customer ID");
				 long custiD= sc.nextLong();
				 System.out.println("enter the amount withdrawl");
		 		 int amount1 = sc.nextInt();
		 		 Customer c2 = b1.getCustomerByID(custiD);
		 		 Account debitA = c2.getAccount();
		 		 debitA.debit(amount1);
		 		 System.out.println("successfully debited " + amount1);
		 		 break;
		case 7:  System.out.println("Enter your customer ID");
				 long custid= sc.nextLong();
				 System.out.println("enter the amount transfer");
				 int amount2 = sc.nextInt();
				 Customer c3 = b1.getCustomerByID(custid);
				 Customer c4 = b1.getCustomerByID(custid);
				 Account debitB = c3.getAccount();
				 Account debitC = c4.getAccount();
			     debitB.transferTo(debitC,amount2);
				 System.out.println("successfully transferd " + amount2);
				 break;
	    case 8:  System.out.println("Thank you");
			     break;
	default:
		System.out.println("Enter a value within 1 to 4");
		}
		
		} while(options!=8);
	}
}
		
	
	/*	Bank b1 = new Bank();
		
		
		Customer c1 = new Customer();
		b1.addnewCustomer(c1);
		Customer c2 = new Customer(123,"varun","rayabandi","hyd");
		b1.addnewCustomer(c2);
		Customer c3 = new Customer("kalyan","munjamopalli","hyderabad");
		b1.addnewCustomer(c3);
		
		Customer[] custs = b1.getCustomers();
		for (int i=0; i<b1.getCustomercount();i++) {
				System.out.println(custs[i]);
				
				
		System.out.println(custs[0]);
		System.out.println(custs[1]);
		System.out.println(custs[2]);
		System.out.println(b1.getCustomercount());*/
		
		


