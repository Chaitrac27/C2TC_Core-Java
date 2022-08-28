package com.cg.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		
		String inputstr = "Test String";
		String pattern = "Test String";
		
		boolean patternMatched = Pattern.matches(pattern, inputstr);
		System.out.println(patternMatched);
		
		String input = "Shop,Mop,Hopping,Chopping";
		Pattern pattern1 = Pattern.compile("hop");
		Matcher matcher = pattern1.matcher(input);
		System.out.println(matcher.matches());
		while(matcher.find())
			System.out.println(matcher.group()+ " :" + matcher.start() + ":"+matcher.end());}

}
