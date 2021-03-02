package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exeptions.InsufficientFundsException;

public abstract class Account {
	public abstract double getBalance();
	public abstract void deposit(Object amount);
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalThreadStateException;
	public abstract void withdraw(double amount) throws InsufficientFundsException;
}