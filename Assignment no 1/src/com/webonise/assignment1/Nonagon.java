package com.webonise.assignment1;

public class Nonagon implements InteriorAngle{
	
	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of Nonagon : "+180*(9-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=9*length;
		System.out.println("Perimeter of nonagon : "+ans);
	}
}
