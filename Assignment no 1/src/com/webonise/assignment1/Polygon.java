package com.webonise.assignment1;

public class Polygon {
	
	public static void main(String args[]){
		
		InteriorAngle ia;                     //Reference of the interface is created 
		ia = new Triangle();                  //Triangle class reference is assign to this interface reference.    
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Square();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Pentagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Hexagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Heptagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Octagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Nonagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
		ia = new Decagon();
		ia.calculateSumOfAngle();
		ia.calculatePerimeter();
	}
}
