package com.provider;

import serviceimpl.AccountServiceImpl;

public class BussinessObjProvider
{
		static AccountServiceImpl a1;
		public static AccountServiceImpl providerobj()
		{
			a1=new AccountServiceImpl();
			
			return a1;
		}
}
