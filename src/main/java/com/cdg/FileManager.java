package com.cdg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

	List<String> contents;
	
	
	public void readLineFromFile(String filename) throws IOException {

		String temp;
		contents = new ArrayList<String>();
		
		BufferedReader fileInput = new BufferedReader(new FileReader(filename));

		while ((temp = fileInput.readLine()) != null) {
			contents.add(temp);
		}
		

		fileInput.close();
	}

	public void writeMaskingDataToFile(String filename) throws FileNotFoundException {

		File outfile = new File(filename);

		PrintStream ps = new PrintStream(new FileOutputStream(outfile));

		PrintStream sysout = System.out;

		System.setOut(ps);
		// System.setErr(ps);

		for(int i = 0; i < contents.size(); i++) {
			System.out.println(contents.get(i));
		}

		System.setOut(sysout);

		ps.close();
	}
	
}
