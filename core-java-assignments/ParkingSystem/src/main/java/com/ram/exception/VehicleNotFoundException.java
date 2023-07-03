package com.ram.exception;

public class VehicleNotFoundException extends Exception{

	@Override
	public String getMessage() {
		System.out.println("Vehicle Is Not Present In Lane");
		return super.getMessage();
	}
	
}
