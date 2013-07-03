package com.webonise.assignment1;

public class Pentagon implements InteriorAngle {

	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of pentagon : "+180*(5-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=5*length;
		System.out.println("Perimeter of pentagon : "+ans);
	}
}
