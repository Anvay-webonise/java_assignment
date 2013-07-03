package com.webonise.assignment.javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetCollection {
	
	public static void main(String args[]){
		
		Set <String> myHashSet = new HashSet <String>();
		
		String myStr = "I come I see I conqure I go";
		String myArray[] = myStr.split(" ");
		
		for (int i = 0; i < myArray.length; i++) {
			
			if(myHashSet.contains(myArray[i])){
				continue;
			}
			else{
				myHashSet.add(myArray[i]);
			}
		}
	
		for (Iterator iterator = myHashSet.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
			System.out.print(" "+string);
		}
	}
}
