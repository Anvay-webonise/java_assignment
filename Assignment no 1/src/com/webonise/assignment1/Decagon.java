package com.webonise.assignment1;

public class Decagon implements InteriorAngle {
	
	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of Decagon : "+180*(10-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=10*length;
		System.out.println("Perimeter of hexagon : "+ans);
	}
}
