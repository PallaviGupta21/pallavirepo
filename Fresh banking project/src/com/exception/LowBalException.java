package com.exception;

public class LowBalException extends Exception{

	private String msg;

	public LowBalException(String msg) {
		//super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "LowBalException [msg=" + msg + "]";
	}
	
	
}
