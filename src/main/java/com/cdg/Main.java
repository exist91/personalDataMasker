package com.cdg;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		FileManager fileManager = new FileManager();
		Masker masker = new Masker();
		
		fileManager.readLineFromFile("src/main/java/com/cdg/data.txt");
		
		masker.maskPersonalData(fileManager.getContents());
		
		fileManager.writeMaskingDataToFile("src/main/java/com/cdg/result.txt");
		
		
	}

}
