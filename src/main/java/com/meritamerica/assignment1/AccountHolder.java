package com.meritamerica.assignment1;

public class AccountHolder
{
	private String nameFirst;
	private String nameMiddle;
	private String nameLast;
	private String ssn;
	private CheckingAccount accountChecking;
	private SavingsAccount accountSavings;

	AccountHolder()
	{
		nameFirst = new String();
		nameMiddle = new String();
		nameLast = new String();
		ssn = new String();
		accountChecking = new CheckingAccount( 0 );
		accountSavings = new SavingsAccount( 0 );
	}

	AccountHolder( String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance )
	{
		setFirstName( firstName );
		setMiddleName( middleName );
		setLastName( lastName );
		setSSN( ssn );
		accountChecking = new CheckingAccount( 100 );
		accountSavings = new SavingsAccount( 1000 );
	}

	public String getFirstName()
	{
		return nameFirst;
	}

	public void setFirstName( String firstName )
	{
		nameFirst = firstName;
	}

	public String getMiddleName()
	{
		return nameMiddle;
	}

	public void setMiddleName( String middleName )
	{
		nameMiddle = middleName;
	}

	public String getLastName()
	{
		return nameLast;
	}

	public void setLastName( String lastName )
	{
		nameLast = lastName;
	}

	public String getSSN()
	{
		return ssn;
	}

	public void setSSN( String ssn )
	{
		this.ssn = ssn;
	}

	public CheckingAccount getCheckingAccount()
	{
		return accountChecking;
	}

	public SavingsAccount getSavingsAccount()
	{
		return accountSavings;
	}

	public String toString()
	{
		StringBuilder s = new StringBuilder( "Name: " + getFirstName() + " " + getMiddleName() + " " + getLastName() );
		s.append( "\nSSN: " + getSSN() );
		s.append( "\n" + getCheckingAccount().toString() );
		s.append( "\n" + getSavingsAccount().toString() );
		return s.toString();
	}
}
