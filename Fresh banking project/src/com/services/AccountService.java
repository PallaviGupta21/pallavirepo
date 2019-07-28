package com.services;

import com.exception.InvalidAccountNoException;
import com.exception.LowBalException;

public interface AccountService 
{
	int openAccount(String type,float amt);
	float Deposit(int accNo, float amt)throws InvalidAccountNoException;
	float withdraw(int accNo,float amt)throws InvalidAccountNoException, LowBalException;
	
	
	void balEnquire(int accNo) throws InvalidAccountNoException;
	void info(int accNo);
}
