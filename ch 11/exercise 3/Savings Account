class Savings extends Account{
	public Savings(){
		super();
	}
	public Savings(int id, double balance, double annualInterestRate){
		super(id, balance, annualInterestRate);
	}
	public void withdraw(double amount){
		if (amount > this.getBalance()){
			System.out.println("Insufficient Funds");
		}
		else{
			super.withdraw(amount);
		}
	}
	public String toString(){
	return "Account Number: " + getID() + "\nCreated on: " + getDateCreated() + "\nBalance: $" + getBalance();
		
	}
	
}
