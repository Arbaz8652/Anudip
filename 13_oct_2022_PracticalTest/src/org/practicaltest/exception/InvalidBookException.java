package org.practicaltest.exception;

public class InvalidBookException extends Exception {

	public InvalidBookException(){
		super();
	}
	public InvalidBookException(String msg){
		super(msg);
	}
}
