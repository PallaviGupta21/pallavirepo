package serviceimpl;

import com.beans.Account;
import com.beans.Branch;
import com.beans.Date;
import com.exception.InvalidAccountNoException;
import com.exception.LowBalException;
import com.services.AccountService;

public class AccountServiceImpl implements AccountService 
{
		Account acc;
		
		@Override
		public int openAccount(String type, float amt) {
			acc=new Account(type,amt );
			acc.setBrac(new Branch("lohegoan","loheg"));
			acc.setDate(new Date(11,2,1002)) ;
			return acc.getAccNo();
		}

		@Override
		public float Deposit(int accNo,float amt) throws InvalidAccountNoException
		{
			
			if(acc.getAccNo()==accNo)
			{
				System.out.println("current acc bal is: "+acc.getAccBal());
				acc.setAccBal(acc.getAccBal()+amt);
			}
			else
			{
				throw new InvalidAccountNoException("plz check the acc no.");
				//System.out.println("plz enter he correct acc no: ");
			}
			
			
			return acc.getAccBal();
		}

		@Override
		public float withdraw(int accNo, float amt) throws InvalidAccountNoException,LowBalException
		{

			if(acc.getAccNo()==accNo)
			{
				System.out.println("current acc bal is: "+acc.getAccBal());
				acc.setAccBal(acc.getAccBal()-amt);
				
				
				if(acc.getAccBal()<amt)
				{
					throw new LowBalException("low balance in account!!!");
				}
			}
			else
			{
				throw new InvalidAccountNoException("plz check the acc no.");
				
				//System.out.println("plz enter he correct acc no: ");
			}
			
			
			
			return acc.getAccBal();
		}

		@Override
		public void balEnquire(int accNo) throws InvalidAccountNoException {
		    if(acc.getAccNo()==accNo)
		    	{
		    	System.out.println(acc.getAccBal());
		    	}
		    else
		    {
		    	throw new InvalidAccountNoException("plz check the acc no.");
		    }
		    
		   // return acc.getAccBal();
		}

		@Override
		public void info(int accNo) {
			// TODO Auto-generated method stub
			
		}
}
