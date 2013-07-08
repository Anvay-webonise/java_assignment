package com.webonise.assignment.RMI;

import java.rmi.*;

/**
 * @author Anvay this StringServer class act as server which rebind the name and
 *         create and passes object of the StingImpl class
 * 
 */
public class StringServer {

	public static void main(String args[]) {
		try {
			StringImpl sr = new StringImpl();
			Naming.rebind("STRING_SERVER", sr);
		} catch (Exception e) {
			System.out.print("The exception is caught : ");
		}
	}
}
