package itxiang_30;

import java.util.Date;

public class DateDemo01 {
	public static void main(String[] args) {
		//public Date():分配一個Date對象,並初始化,以便它代表被分配的時間,精確到毫秒
		Date date=new Date();
		System.out.println(date);
		
		//public Date(long date):分配一個 Date對象,並將其初始化為表示從標準基準時間起指定的毫秒數
		long date1=1000*60*60;
		Date date2=new Date(date1);
		System.out.println(date2);
	}
}
