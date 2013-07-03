package com.webonise.assignment1;

public class Heptagon implements InteriorAngle{

	private int length,ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of heptagon : "+180*(7-2));  	
	}
	
	public void calculatePerimeter(){
		length=4;
		ans=7*length;
		System.out.println("Perimeter of heptagon : "+ans);
	}
}
