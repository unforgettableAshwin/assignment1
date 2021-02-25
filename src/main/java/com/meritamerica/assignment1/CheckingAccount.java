package com.meritamerica.assignment1;

public class CheckingAccount
{
	private double balance = 0;

	CheckingAccount( double openingBalance )
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
		return 0.01;
	}

	public boolean withdraw(
			double amount )
	{
		return false;
	}

	public boolean deposit(
			double amount )
	{
		if( amount >= 0 )
		{
			balance += amount;
			return true;
		}

		return false;
	}

	public double futureValue(
			int years )
	{
		return MeritAmericaBankApp.futureValue( balance, getInterestRate(), years );
		// return balance * Math.pow( 1 + getInterestRate() / 100, years );
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Checking Account Balance: $" + getBalance() );
		s.append( "\nChecking Account Interest Rate: " + String.format( "%.4f", getInterestRate() / 100 ) );
		s.append( "\nChecking Account Balance in 3 years: $" + String.format( "%.2f", futureValue( 3 ) ) );
		return s.toString();
	}
}