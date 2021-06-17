package com.sapient.Exception;

public class ItemEmptyException extends Exception {
	private String msg;

	public ItemEmptyException() {
		this.msg = "seem item is empty";
	}

	public ItemEmptyException(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ItemEmptyException [msg=" + msg + "]";
	}

		
}

