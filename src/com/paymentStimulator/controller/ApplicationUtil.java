package com.paymentStimulator.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationUtil {
	private static Logger LOGGER = LoggerFactory.getLogger(ApplicationUtil.class);

	public static Timestamp convertStringToTimestamp(String dateString) {
		Timestamp timeStampDate = null;
		try {
			if (dateString != null) {
				DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				Date date = (Date) formatter.parse(dateString);
				timeStampDate = new Timestamp(date.getTime());
			}
		} catch (ParseException e) {
			LOGGER.error("ERROR date parsing issue {}", e);
		}
		return timeStampDate;
	}

	public static Date getCurrentDate() {
		LocalDate localDate = LocalDate.now();
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		return date;
	}

	public static Date getCurrentDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		Date dateTime = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		return dateTime;
	}

}
