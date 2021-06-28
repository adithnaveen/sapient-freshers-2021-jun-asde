package com.naveen.services;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeService {
	private static final DateTimeFormatter FORMATTER_24 = DateTimeFormatter.ofPattern("HH:mm:ss");
	private static final DateTimeFormatter FORMATTER_12 = DateTimeFormatter.ofPattern("hh:mm:ss a");

	private boolean is24;

	public TimeService(boolean is24) {
		this.is24 = is24;
	}

	public String getCurrentTime() {
		var  now = LocalTime.now();
		if (is24) {
			return FORMATTER_24.format(now);
		}

		return FORMATTER_12.format(now);
	}

}
