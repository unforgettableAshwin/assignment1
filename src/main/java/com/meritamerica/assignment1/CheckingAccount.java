package com.meritamerica.assignment1;

public class CheckingAccount
{
	private double balance = 0;

	CheckingAccount(
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
	{
		return 0.0001;
	}

	public boolean withdraw(
			double amount
	)
	{
		double balanceAfterWithdrawal = getBalance() - amount;
		if( amount >= 0 && balanceAfterWithdrawal >= 0 )
		{
			balance = balanceAfterWithdrawal;
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
				"Checking Account Balance: $" + MeritAmericaBankApp.formatBalance( getBalance() ) );

		s.append( "\nChecking Account Interest Rate: " + MeritAmericaBankApp.formatInterestRate( getInterestRate() ) );
		s.append( "\nChecking Account Balance in 3 years: $" + MeritAmericaBankApp.formatBalance( futureValue( 3 ) ) );
		return s.toString();
	}
}