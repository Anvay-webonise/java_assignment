package com.webonise.assignment.javainputoutput;

import java.io.*;

/**
 * @author Anvay In this class the file is read using FileInputStream And file
 *         is created and write using FileOutputStream
 * 
 */
public class ReadAndWriteFile {

	public static void main(String[] args) throws Exception {

		OutputStream outputFile = new FileOutputStream("output.txt");
		InputStream inputFile = new FileInputStream("input.txt");

		try {

			int line;
			while ((line = inputFile.read()) != -1) {
				System.out.print(Character.toChars(line));
				outputFile.write(line);
			}
		} catch (Exception e) {
			System.out.print("Error while reading and writing closing ");
		} finally {
			if (inputFile != null || outputFile != null) {
				try {
					inputFile.close();
					outputFile.close();
				} catch (IOException e) {
					System.out.print("Error while file closing ");
				}
			}
		}

	}

}
