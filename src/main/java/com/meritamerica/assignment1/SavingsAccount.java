package com.meritamerica.assignment1;

public class SavingsAccount
{
	private double balance = 0;

	SavingsAccount(
			double openingBalance
	)
	{
		if( openingBalance >= 0 )
			balance = openingBalance;
	}

	public double getBalance()
	{
		return balance;
	}

	public double getInterestRate()
	{ // Percentage:
		return 1;
	}

	public boolean withdraw(
			double amount
	)
	{
		return false;
	}

	public boolean deposit(
			double amount
	)
	{
		if( amount >= 0 )
		{
			balance += amount;
			return true;
		}

		return false;
	}

	public double futureValue(
			int years
	)
	{
		return MeritAmericaBankApp.futureValue( getBalance(), getInterestRate(), years );
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder(
				"Savings Account Balance: $" + MeritAmericaBankApp.formatBalance( getBalance() ) );

		s.append( "\nSavings Account Interest Rate: " + MeritAmericaBankApp.formatInterestRate( getInterestRate() ) );
		s.append( "\nSavings Account Balance in 3 years: $"
				+ MeritAmericaBankApp.formatBalance( futureValue( 3 ) ) );
		
		return s.toString();
	}
}