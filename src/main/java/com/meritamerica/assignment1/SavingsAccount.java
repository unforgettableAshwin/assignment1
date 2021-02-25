package com.meritamerica.assignment1;

public class SavingsAccount
{
	SavingsAccount( double openingBalance )
	{
	}

	public double getBalance()
	{
		return 0;
	}

	public double getInterestRate()
	{ // Percentage:
		return 1;
	}

	public boolean withdraw( double amount )
	{
		return false;
	}

	public boolean deposit( double amount )
	{
		return false;
	}

	public double futureValue( int years )
	{
		return 0;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Savings Account Balance: " + getBalance() );
		s.append( "\nSavings Account Interest Rate: " + getInterestRate() );
		s.append( "\nSavings Account Balance in 3 years: " + futureValue( 3 ) );
		return s.toString();
	}
}