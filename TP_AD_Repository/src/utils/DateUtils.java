package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static Date parseDate(String fecha) {
		Date d = new Date();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			d = formatter.parse(fecha);
		} catch (Exception e) {
			// mandar saludos
		}
		return d;
	}

	public static Date parseWebDate(String fecha) {
		Date d = new Date();
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM, yyyy");
			d = formatter.parse(fecha);
		} catch (Exception e) {
			// mandar saludos
		}
		return d;
	}

	public static String invParseDate(Date date) {
		String s = "";
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			s = formatter.format(date);
		} catch (Exception e) {
			// mandar saludos
		}
		return s;
	}
}
