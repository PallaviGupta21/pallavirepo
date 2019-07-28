package com.beans;

public class Branch
	{
	static private String ifsc="SBI2341";
	private String branchName;
    private String loc;
    
	public Branch(String branchName, String loc) 
	{
		
		this.branchName = branchName;
		this.loc = loc;
	}

	public static String getIfsc() 
	{
		return ifsc;
	}

	public static void setIfsc(String ifsc)
	{
		Branch.ifsc = ifsc;
	}

	public String getBranchName() 
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Branch [branchName=" + branchName + ", loc=" + loc + "]";
	}
	
	
}
