package com.meritamerica.assignment1;

public class AccountHolder
{
	private AccountHolder()
	{
	}

	private AccountHolder( String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance )
	{
	}

	public String getFirstName()
	{
		return "";
	}

	public void setFirstName( String firstName )
	{

	}

	public String getMiddleName()
	{
		return "";
	}

	public void setMiddleName( String middleName )
	{
	}

	public String getLastName()
	{
		return "";
	}

	public void setLastName( String lastName )
	{
	}

	public String getSSN()
	{
		return "";
	}

	public void setSSN( String ssn )
	{
	}

	public CheckingAccount getCheckingAccount()
	{
		return new CheckingAccount( 0 );
	}

	public SavingsAccount getSavingsAccount()
	{
		return new SavingsAccount();
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() );
		s.append( "\nSSN: " + getSSN() );
		s.append( "\nChecking Account Balance: " + getCheckingAccount().getBalance() );
		s.append( "\nChecking Account Interest Rate: " + getCheckingAccount().getInterestRate() );
		s.append( "\nChecking Account Balance in 3 years: " + getCheckingAccount().futureValue( 3 ) );
		s.append( "\n: " + get );
		s.append( "\n: " + get );
		s.append( "\n: " + get );
		s.append( "\n: " + get );
		s.append( "\n: " + get );
		s.append( "\n: " + get );
		s.append( "\n: " + get );

		return s.toString();
	}
}
