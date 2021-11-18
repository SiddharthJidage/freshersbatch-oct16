package BankACC;


import javax.naming.InsufficientResourcesException;

public class BankAccount {
		int a;
		int BankAccountBalance = 1000;
	public String Withdraw(int a) throws InsufficientResourcesException  {
		if(a< BankAccountBalance) {
			return ("wait for a momment");
		}
		else
		{
			throw new InsufficientResourcesException("Insufficient Funds");
		}
		
	}
}