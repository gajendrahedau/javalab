package com.cg.labbook.lab6prob2;
public class SavingsAccount extends Account{
	private final double MINIMUM_BALANCE=200;
	public SavingsAccount(double balance, Person person) {
		super(balance, person);
	}
public  SavingsAccount() {
}
	@Override
	public void Withdraw(float withdraw) {
		if((this.balance>MINIMUM_BALANCE)&&(this.balance-withdraw)>MINIMUM_BALANCE)
			System.out.println("Balance:"+(this.balance-withdraw));
		else
			System.out.println("Not able to withdraw money");
	}	
}
