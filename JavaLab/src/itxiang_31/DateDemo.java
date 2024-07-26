package itxiang_31;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		//創建日期對象
		Date date=new Date();
		
		String s1	=DateUtils.dateToString(date,"yyyy年MM月dd日 HH:mm:ss");
		System.out.println(s1);
		
		String s2= DateUtils.dateToString(date, "yyyy年MM月dd日");
		System.out.println(s2);
		
		String s3= DateUtils.dateToString(date, "HH:mm:ss");
		System.out.println(s3);
		
		String s="2048-08-09 12:12:12";
		Date dd=	DateUtils.stringToDate(s,"yyyy-MM-dd HH:mm:ss");
		System.out.println(dd);
	}

}
