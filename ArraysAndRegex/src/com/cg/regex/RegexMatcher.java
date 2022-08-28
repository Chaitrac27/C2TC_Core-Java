package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

	public static void main(String[] args) {
		String line = "This order was places for QT3000! OK?";
		
		String pattern = "(.*)(\\d+)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		if(m.find())
		{
			System.out.println("Found value:" +m.group(0));
		}
		else
		{
			System.out.println("No Match");
		}
	}

}
