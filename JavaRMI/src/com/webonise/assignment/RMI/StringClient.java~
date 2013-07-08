package com.webonise.assignment.RMI;

import java.rmi.*;
import java.io.*;

/**
 * @author Anvay this class act as client take input from user passes it to
 *         server and print the result return by server.
 * 
 */
public class StringClient {

	public static void main(String args[]) {

		try {
			String url, myStr;
			int count;

			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			url = "rmi://127.0.0.1/STRING_SERVER";
			StringIntf sf = (StringIntf) Naming.lookup(url);

			System.out.println("Enter the string : ");
			myStr = br.readLine();

			count = sf.check(myStr);

			if (count == 0)
				System.out.print("String is well parenthesis : ");
			else
				System.out.print("String is Not well parenthesis : ");
		} catch (Exception e) {
		}
	}
}
