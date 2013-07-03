package com.webonise.assignment1;

public class Triangle implements InteriorAngle {

	private int a,b,c;
	public int ans;
	public void calculateSumOfAngle(){
		
		System.out.println("Sum of interior angle of triangle : "+180*(3-2));  	
	}
	
	public void calculatePerimeter(){
		
		a=10;
		b=20;
		c=30;
		ans=a+b+c;
		System.out.println("Perimeter of triangle is : "+ans); 
	}
}
