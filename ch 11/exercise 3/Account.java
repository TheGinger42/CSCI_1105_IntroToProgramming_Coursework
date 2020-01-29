class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date date;
	
	public Account(){
		date = new java.util.Date();
	}
	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate * 100;
		date = new java.util.Date();
	}
	public double getID(){
		return this.id;
	}
	
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getAnnualInterestRate(){
		this.annualInterestRate = annualInterestRate;
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public java.util.Date getDateCreated(){
		
		return this.date;
	}
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate;
	}
	public double getMonthlyInterest(){
		double monthlyInterest = balance * (annualInterestRate / 1200);
		return monthlyInterest;
	}
	public void withdraw(double amount){
		balance = balance - amount;
	}
	public void deposit(double amount){
		balance = balance + amount;
		
	}
	
}
