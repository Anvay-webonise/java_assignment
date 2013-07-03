package com.webonise.assignment1;

public class Octagon implements InteriorAngle {

	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of octagon : "+180*(8-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=8*length;
		System.out.println("Perimeter of octagon : "+ans);
	}
}
