package com.cg.labbook.lab6prob2;

public class CurrentAccount extends Account {
	 double overdraftLimit=this.balance;

	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, Person person) {
		super(balance, person);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Withdraw(float withdraw) {
		if(withdraw>overdraftLimit)
			System.out.println("Money to be drawn is greater than balance present");
		else
			System.out.println("Balance:"+(overdraftLimit-withdraw));
	}
	 
	
	

}
