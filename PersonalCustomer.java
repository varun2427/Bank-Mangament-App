package bankapp;

public class PersonalCustomer extends Customer {
	private String homePhone;
	private String workPhone;
	public PersonalCustomer() {
		super();
		homePhone="+916304284868";
		workPhone="+919515218758";
	}
	public PersonalCustomer(String firstName,String lastName,String address,Account account,String email,String phoneNum) {
		super(firstName,lastName,address,account);
		this.homePhone=email;
		this.workPhone=phoneNum;
	}
	public PersonalCustomer(long custID,String firstName,String lastName,String address,Account account,String email,String phoneNum) {
		super(custID,firstName,lastName,address,account);
		this.homePhone=email;
		this.workPhone=phoneNum;
	}
	public String getEmail() {
		return homePhone;
	}
	public void setEmail(String email) {
		this.homePhone=email;
	}
	public String getPhoneNum() {
		return workPhone;
	}
	public void setPhoneNum(String phoneNum) {
		this.workPhone=phoneNum;
	}
	public String toString() {
		return "Personal Customer["+super.toString()+"Home phone: "+homePhone+", work phone: "+workPhone+"]";
	}
}