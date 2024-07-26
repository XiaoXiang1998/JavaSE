package itxiang_30;

import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {
		//public long getTime():獲取的是日期對象從1970年 1月 1日 00:00:00 到現在的毫秒值
		Date date=new Date();
	//		System.out.println(date.getTime());
//		System.out.println(date.getTime()*1.0/1000/60/60/24/365+"年");
		//public void setTime(Long time):設置時間,給的是毫秒值
		long time=System.currentTimeMillis();
		date.setTime(time);		
		System.out.println(date);
	}

}
