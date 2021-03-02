package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(String IBAN, )
	{
		
	}
	
	@Override
	public void deposit(Object amount) {
		
	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException {
		if(this == destination)
			throw new IllegalTransferException();
		this.withdraw(amount);
		destination.deposit(amount);
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > this.balance)
			throw new InsufficientFundsException("You don't have the amount");
		else
			this.balance -= amount;
	}

}
