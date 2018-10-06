package com.cg.labbook.lab6prob2;
public class Account extends Person {
	private long ACCOUNT_NUMBER;
	static long accNo=1001;
	double balance;
	Person person= new Person();
	public  long getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}
	public Account() {
		super();
	}
	public Account(double balance, Person person) {
		super();
		this.ACCOUNT_NUMBER=accNo++;
		this.balance = balance;
		this.person = person;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public  void setACCOUNT_NUMBER(int aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public void Deposit(float deposit){
		this.balance= this.balance+deposit;	
	}
	public void Withdraw(float withdraw){
		this.balance= this.balance-withdraw;
	}
	public void checkAge(float age)throws InputAgeException{
		if(age<15)
			throw new InputAgeException("Please enter age above 15 yrs");
	}
	@Override
	public String toString() {
		return "Account [accountNumber="+ACCOUNT_NUMBER+"balance=" + balance + ", person=" + person + "]";
	}
}
