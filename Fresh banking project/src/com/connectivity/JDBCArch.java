package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCArch 
{
	
	Connection con;
	Statement stmt;
	//PreparedStatement ps;
	ResultSet rs;
	
	public void connect ()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","pallai");
			stmt=con.createStatement();
			System.out.println("coonnection esatablish");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	/*
	public void executeSelect(){
		try{
			
			rs=stmt.executeQuery("select * from Account  ");
			while(rs.next())
			{
				int accNo=rs.getInt(1);
				String accType  =rs.getString(2);
				float accBal =rs.getFloat(3);
				
				System.out.println(" account no : "+accNo);
				System.out.println("account type : "+accType);
				System.out.println("account Bal: "+accBal);
			}
			
		 }
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		
		
		
		
	public void executeUpdate()
	{
		int updateCnt=0;
		
		try{
			updateCnt=stmt.executeUpdate("insert into Account value(101,'saving',1000.80)");
			System.out.println(updateCnt+"no. of record updated.");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}

	*/
	public static void main(String[] args)
	{
		JDBCArch architecture= new JDBCArch ();
		architecture.connect();
		//architecture.executeSelect();
		//architecture.executeUpdate();
		
	}

}
