package com.client;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.exception.InvalidAccountNoException;
import com.exception.LowBalException;
import com.provider.BussinessObjProvider;
import com.services.AccountService;

import serviceimpl.AccountServiceImpl;

public class clientCode {

	public static void main(String[] args)
	{
	/*	
		AccountServiceImpl a=new AccountServiceImpl();
		System.out.println("your account has be created!!!!\n acc no :"+a.openAccount("saving",100000));
		*/
		
	//	AccountServiceImpl s1=new AccountServiceImpl();
		Scanner sc=new Scanner(System.in);     
		AccountService as=BussinessObjProvider.providerobj();
		
		
		System.out.println("Congrats!!!!\n Your account has be created!!!!\n Your account no :");
		System.out.println("enter the type of account ");
		//sc.setAccType(sc.getAccType());  ----------------------setaccont no.
		//+as.openAccount("saving",100000));
		
		try{
			int acNo = sc.nextInt();
			float acBal = sc.nextFloat();
			String acType = sc.next();
			
		System.out.println("Account Balance after Deposited of money : "+as.Deposit(acNo,acBal));
			
		System.out.println("Account Balance after Widhdrawl of money : "+as.withdraw(100,5000));
		
		System.out.println("Balance Enquiry");
		
		as.balEnquire(100);
		
		}
		catch(InvalidAccountNoException e){
			e.printStackTrace();
		}
		catch(LowBalException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
