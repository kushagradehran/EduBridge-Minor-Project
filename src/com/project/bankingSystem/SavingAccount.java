package com.project.bankingSystem;

import java.util.Date;

public interface SavingAccount
{
	final double rate = 0.04,limit = 10000,limit1 = 200;
	void deposit(double n,Date d);
	void withdraw(double n,Date d);
}
