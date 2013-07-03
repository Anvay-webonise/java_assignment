package com.webonise.assignment1;

public class Square implements InteriorAngle {

	private int length,ans;
	
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of square : "+180*(4-2));  	
	}
	public void calculatePerimeter(){
		
		length=5;
		ans=4*length;
		System.out.println("Perimeter of square : "+ans);
	}
}

