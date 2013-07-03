package com.webonise.assignment1;

public class Hexagon implements InteriorAngle {
	
	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of hexagon : "+180*(6-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=6*length;
		System.out.println("Perimeter of hexagon : "+ans);
	}
}
