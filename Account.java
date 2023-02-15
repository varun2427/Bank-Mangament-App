package bankapp;

public class Account {
	private static int nextID=0;
    private String accountNumber="HDFC00";
    private String name;
    private String id;
    private  int balance = 0;
    public Account() {
    	this.accountNumber = this.accountNumber+nextID;
    	this.name="name";
    	balance = 0;
    	nextID++;
    	
    }
    
    public Account(String id , String name) {
    	this.id=id;
    	this.name=name;
    	balance=0;
    	nextID++;
    }
    public Account(String id , String name,int balance) {
    	this.id=id;
    	this.name=name;
    	balance=0;
    	nextID++;

    
    }
	public String getId() {
    	return id;
    }
    public void setId(String id) {
    	this.id = id;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name= name;
    }
    public int getBalance() {
    	return balance ;
    }
    public void setBalance(int balance) {
    	this.balance= balance;
    }
    public int credit(int amount) {
    	balance =balance +amount;
    	return balance;
    }
    public int debit(int amount) {
    	if(amount<=balance) {
    	     balance=balance-amount;
    }else 
    		 System.out.println("Amount exceeded balannce");
    
    return balance;
    }
    public int transferTo(Account another,int amount) {
    	this.debit(amount);
    	another.credit(amount);
    	if(amount<=balance) {
   	     balance=balance-amount;
   	 another. balance =another.balance +amount;
   }else 
   		 System.out.println("Amount exceeded balannce");
    	return balance;
   
    }
    public String toString() {
    	return "Amount[id="+id+", name="+name+" , balance="+balance+"]";
    }
}
    
    
    
    

    
    