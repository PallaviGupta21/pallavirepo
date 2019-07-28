package com.beans;

public class Account
{
		
		static private int accNo=100;
		private String accType;
		private float accBal;
		
		//dependencies-has a 
		private Branch Brac; 
	    private Date date;
	   
	 
	  public String toString()
	  	{
		   System.out.println(" ------ ACCOUNTS and BRANCH DETAILS ------");
			 return "Acc no: "+accNo+"   acc type : "+accType+"   Acc bal: "+accBal+"\n"+Brac+"\n Date of transc:  "+date;
		}
	  
	public static int getAccNo() 
	{
		return accNo;
	}

	public static void setAccNo(int accNo)
	{
		Account.accNo = accNo;
	}

	public String getAccType() 
	{
		return accType;
	}

	public void setAccType(String accType)
	{
		this.accType = accType;
	}

	public float getAccBal() 
	{
		return accBal;
	}

	public void setAccBal(float accBal)
	{
		this.accBal = accBal;
	}

	public Branch getBrac()
	{
		return Brac;
	}

	public void setBrac(Branch brac) 
	{
		Brac = brac;
	}

	public Date getDate() 
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

	public Account( String accType, float accBal,Branch Brac,Date date) 
	{
		
		this.accType = accType;
		this.accBal = accBal;
		this.Brac=Brac;
		this.date=date;
		accNo++;
	}
	  
	public Account( String accType, float accBal) 
	{
		
		this.accType = accType;
		this.accBal = accBal;
		
	}
	      
}
