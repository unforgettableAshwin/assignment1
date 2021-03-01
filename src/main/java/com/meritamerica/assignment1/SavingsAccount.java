package com.meritamerica.assignment1;

public class SavingsAccount
{
	private double balance = 0;

	SavingsAccount(
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
		return 0.01;
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
				"Savings Account Balance: $" + MeritAmericaBankApp.formatBalance( this.getBalance() ) );

		s.append( "\nSavings Account Interest Rate: " + MeritAmericaBankApp.formatInterestRate( this.getInterestRate() ) );
		s.append( "\nSavings Account Balance in 3 years: $"
				+ MeritAmericaBankApp.formatBalance( this.futureValue( 3 ) ) );
		
		return s.toString();
	}
}