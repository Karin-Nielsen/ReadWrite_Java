/**
 * File name: 	ReadWrite.java
 * Author: 		Karin Nielsen
 * Date: 		10/01/2020
 * Version: 	1.0
 * Copyright: 	All Rights Reserved 2020
 * Description: 
 * 				Simple example java file designed to read text from a file and output text to another file using the
 * 				java.io packages File, FileInputStream, and FileOuputStream. 
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		
		/* Create input and output stream objects */
		FileInputStream inStream = null;
		FileOutputStream outStream = null;

		try {
			/* Define File objects */
			File inFile = new File("input.txt");
			File outFile = new File("output.txt");

			/* Open input and output streams */
			inStream = new FileInputStream(inFile);
			outStream = new FileOutputStream(outFile);

			/* Buffer size for reading data, store length of input */
			byte[] buffer = new byte[1024];
			int length;
			
			/* Write to output file */
			while ((length = inStream.read(buffer)) > 0) {
				outStream.write(buffer, 0, length);
			}

			/* Closing input/output file streams */
			inStream.close();
			outStream.close();

			System.out.println("Written Content to another file.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}