package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
System.out.println("deposit occurs from 30% to 35%");
System.out.println("Its a default bank details");
	}	
	
public static void main(String[] args) {
	AxisBank ax = new AxisBank();
	ax.deposit();
	ax.saving();
}}


