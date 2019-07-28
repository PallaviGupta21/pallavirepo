package com.exception;

public class InvalidAccountNoException  extends Exception{
 
	private String msg;

	public InvalidAccountNoException(String msg) {
		// super();  // oferr to object(supest class)
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "InvalidAccountNoException [msg=" + msg + "]";
	}
	
	
}
