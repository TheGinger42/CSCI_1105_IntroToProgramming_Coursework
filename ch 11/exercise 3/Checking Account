public class Checking extends Account {
	private double overdraftLimit = 250;
	private double overDraw;
	
	public Checking(){
		super();
		
	}
	public Checking(double overdraftLimit){
		super();
		this.overdraftLimit = overdraftLimit;
		this.overDraw = overDraw;
	}
	public Checking(double overdraftLimit, int id, double balance, double annualInterestRate){
		super(id, balance, annualInterestRate);
		this.overdraftLimit = overdraftLimit;
		this.overDraw = overDraw;
		
	}
	public void withdraw(double amount){
	
		if (amount > this.getBalance() + overdraftLimit){
			System.out.println("Not enough funds");
		}
		else {
			super.withdraw(amount);
		}
	
	}
	
	public String toString(){
	return "Account Number: " + getID() + "\nCreated on: " + getDateCreated() + "\nBalance: $" + getBalance();
		
	}
	
}
