package org.banking;

public class AxisBank extends BankInfo {
	
	public void deposit(int recur) 
	{
		System.out.println("The Recurring Deposit is " + recur);
	}


 public static void main(String[] args)
 {
	 AxisBank axis = new AxisBank();
	 axis.deposit(1200);
	 
	 BankInfo bank = new BankInfo();
	 bank.deposit(1400);
 }
 
}