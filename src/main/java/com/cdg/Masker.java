package com.cdg;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Masker {

	public void maskPersonalData(List<String> contents) {
		

		Pattern target = Pattern.compile("(\\d{6})-(\\d{7})|(\\d{4}-){3}(\\d{4})|(\\d{2})-(\\d{6})-(\\d{2})");
		Matcher matcher;
		
		for(int i = 0; i < contents.size(); i++) {
			
			matcher = target.matcher(contents.get(i));
			
			if (matcher.find()) {
				
				String temp = contents.get(i).replaceAll("[0-9]", "*");
				contents.set(i, temp);
				System.out.println(contents.get(i));
			}	
		}

	}
	
}
