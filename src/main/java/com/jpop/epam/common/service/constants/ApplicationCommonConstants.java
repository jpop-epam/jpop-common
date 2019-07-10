package com.jpop.epam.common.service.constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public interface ApplicationCommonConstants {
	String DATE_FORMAT = "dd-MMM-yyyy '@' HH:mm:ss";
	SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);
	
	static String getCurrentDate() {
		return DATE_FORMATTER.format(new Date());
	}
}
