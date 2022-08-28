package com.cg.dateandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

public static void main(String[] args) {
		
		ZonedDateTime currentTime = ZonedDateTime.now();
		ZonedDateTime currentTimeInParis = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
		ZonedDateTime currentTimeInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("India:"+currentTime);
		System.out.println("Paris:"+currentTimeInParis);
		System.out.println("New York:"+currentTimeInNewYork);
	}
}
