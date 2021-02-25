package com.meritamerica.assignment1;

public class CheckingAccount
{
	private double balance = 0;

	CheckingAccount(
			double openingBalance
	)
	{
		if( openingBalance >= 0 )
			this.balance = openingBalance;
	}

	public double getBalance()
	{
		return this.balance;
	}

	public double getInterestRate()
	{
		return 0.0001;
	}

	public boolean withdraw(
			double amount
	)
	{
		double balanceAfterWithdrawal = this.getBalance() - amount;
		if( amount >= 0 && balanceAfterWithdrawal >= 0 )
		{
			this.balance = balanceAfterWithdrawal;
			return true;
		}
		
		return false;
	}

	public boolean deposit(
			double amount
	)
	{
		if( amount >= 0 )
		{
			this.balance += amount;
			return true;
		}

		return false;
	}

	public double futureValue(
			int years
	)
	{
		return MeritAmericaBankApp.futureValue( this.getBalance(), this.getInterestRate(), years );
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder(
				"Checking Account Balance: $" + MeritAmericaBankApp.formatBalance( this.getBalance() ) );

		s.append( "\nChecking Account Interest Rate: " + MeritAmericaBankApp.formatInterestRate( this.getInterestRate() ) );
		s.append( "\nChecking Account Balance in 3 years: $" + MeritAmericaBankApp.formatBalance( this.futureValue( 3 ) ) );
		return s.toString();
	}
}