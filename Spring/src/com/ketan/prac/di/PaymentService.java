package com.ketan.prac.di;

public class PaymentService {
	
	private String name;
	private String accNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	
	public void makePayment(){
		System.out.println("Payment Made!!!");
	}

}
