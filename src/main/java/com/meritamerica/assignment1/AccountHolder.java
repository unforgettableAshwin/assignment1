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
		return new CheckingAccount();
	}

	public SavingsAccount getSavingsAccount()
	{
		return new SavingsAccount();
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() );

		return s.toString();
	}
}
