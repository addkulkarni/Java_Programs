public class Bank
{
	public void createAccount()
	{
		System.out.println("Account has been created successfully");
	}

	public void depositMoney()
	{
		System.out.println("Rs.100 has been deposited");	
	}

	public void withdrawMoney()
	{
		System.out.println("Rs.200 have been withdrawn");
	}

	public void checkBalance()
	{
		System.out.println("Balance is: Rs.500");
	}

	public static void main(String args[])
	{
		Bank b=new Bank();
		b.createAccount();
		b.depositMoney();
		b.withdrawMoney();
		b.checkBalance();
	}
}

