package itxiang_31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	private DateUtils() {}
	
	/*
	 * 把日期轉為指定格式的字符串
	 * 返回值類型:String
	 * 參數:Date date,String format
	 */
	
	public static String dateToString(Date date,String format) {
		SimpleDateFormat sdf =new SimpleDateFormat(format);
		String s=	sdf.format(date);
		return s;
	}
	
	/*
	 * 把字符串解析為指定格式的日期
	 * 返回值類型:Date
	 * 參數:String s,String format
	 */
	public static Date stringToDate(String s,String format) throws ParseException {
		SimpleDateFormat sdf =new SimpleDateFormat(format);
		Date date= sdf.parse(s);
		return date;
	}
}
