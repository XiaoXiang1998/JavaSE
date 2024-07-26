package itxiang_30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		//格式化 從Date到String
		Date date=new Date();
//		SimpleDateFormat sdf=new SimpleDateFormat();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		String string=	sdf.format(date);
		System.out.println(string);
		
		//從String 到date
		String ss="2048-08-09 11:11:11";
		//ParseException
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date2 = sdf2.parse(ss);
		System.out.println(date2);
	}
}
