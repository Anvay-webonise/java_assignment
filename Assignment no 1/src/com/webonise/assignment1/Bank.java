package com.webonise.assignment1;



public class Bank {

	public static void main(String[] args) {
		
		Account a1=new Account();
		int bal;
		
		a1.setBalance(4000);
		bal=a1.getBalance();
		
		System.out.println("Balance is : "+bal);
		
	}
}
